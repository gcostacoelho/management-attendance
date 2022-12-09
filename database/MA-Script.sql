-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ma
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ma` ;

-- -----------------------------------------------------
-- Schema ma
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ma` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema ma
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `ma` ;

-- -----------------------------------------------------
-- Schema ma
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ma` DEFAULT CHARACTER SET utf8 ;
USE `ma` ;

-- -----------------------------------------------------
-- Table `ma`.`Guiche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Guiche` (
  `idGuiche` INT NOT NULL AUTO_INCREMENT,
  `numeroGui` VARCHAR(10) NOT NULL,
  `descricaoGui` VARCHAR(90) NULL,
  PRIMARY KEY (`idGuiche`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ma`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Funcionario` (
  `idFuncionario` INT NOT NULL AUTO_INCREMENT,
  `nomeFun` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `telefone` VARCHAR(11) NULL,
  `email` VARCHAR(45) NOT NULL,
  `cargo` VARCHAR(50) NOT NULL,
  `permissao` TINYINT NOT NULL,
  `Guiche_idGuiche` INT,
  PRIMARY KEY (`idFuncionario`),
    FOREIGN KEY (`Guiche_idGuiche`)
    REFERENCES `ma`.`Guiche` (`idGuiche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `ma`.`Usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `usuario` VARCHAR(10) NOT NULL,
  `senha` VARCHAR(8) NOT NULL,
  `Funcionario_idFuncionario` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `ma`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `ma`.`Servico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Servico` (
  `idServico` INT NOT NULL AUTO_INCREMENT,
  `sigla` VARCHAR(5) NOT NULL,
  `nomeSer` VARCHAR(45) NOT NULL,
  `descricaoSer` VARCHAR(80) NULL,
  `statusSer` TINYINT NULL,
  PRIMARY KEY (`idServico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ma`.`Prioridade`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Prioridade` (
  `idPrioridade` INT NOT NULL AUTO_INCREMENT,
  `nomePri` VARCHAR(45) NOT NULL,
  `descricaoPri` VARCHAR(45) NULL,
  `peso` INT NOT NULL,
  `statusPri` TINYINT NULL,
  `Servico_idServico` INT NOT NULL,
  PRIMARY KEY (`idPrioridade`),
  FOREIGN KEY (`Servico_idServico`)
    REFERENCES `ma`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ma`.`Senha`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Senha` (
  `idSenha` INT NOT NULL AUTO_INCREMENT,
  `numeroSen` INT NOT NULL,
  `dataSen` DATE NOT NULL,
  `horaSen` TIME NOT NULL,
  `Prioridade_idPrioridade` INT NOT NULL,
  PRIMARY KEY (`idSenha`),
    FOREIGN KEY (`Prioridade_idPrioridade`)
    REFERENCES `ma`.`Prioridade` (`idPrioridade`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ma`.`Atendimento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Atendimento` (
  `idAtendimento` INT NOT NULL AUTO_INCREMENT,
  `statusAte` VARCHAR(45) NOT NULL,
  `dataAte` DATE NOT NULL,
  `horaAte` TIME NOT NULL,
  `nota` VARCHAR(45) NULL,
  `Senha_idSenha` INT NOT NULL,
  `Funcionario_idFuncionario` INT NOT NULL,
  PRIMARY KEY (`idAtendimento`),
    FOREIGN KEY (`Senha_idSenha`)
    REFERENCES `ma`.`Senha` (`idSenha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `ma`.`Funcionario` (`idFuncionario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ma`.`Presta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Presta` (
  `Guiche_idGuiche` INT NOT NULL,
  `Servico_idServico` INT NOT NULL,
  PRIMARY KEY (`Guiche_idGuiche`, `Servico_idServico`),
    FOREIGN KEY (`Guiche_idGuiche`)
    REFERENCES `ma`.`Guiche` (`idGuiche`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    FOREIGN KEY (`Servico_idServico`)
    REFERENCES `ma`.`Servico` (`idServico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `ma` ;

-- -----------------------------------------------------
-- Table `ma`.`guiche`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ma`.`Guiche` (
  `idGuiche` INT(11) NOT NULL AUTO_INCREMENT,
  `numeroGui` VARCHAR(10) NOT NULL,
  `descricaoGui` VARCHAR(90) NULL DEFAULT NULL,
  PRIMARY KEY (`idGuiche`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


use ma;

DELIMITER //
CREATE FUNCTION somaSenha()
RETURNS int
READS SQL DATA
DETERMINISTIC
BEGIN
	return (select max(numeroSen) + 1 from Senha);
END //
DELIMITER ;



insert into Servico (sigla, nomeSer, descricaoSer, statusSer) values("ATP", "Atendimento Preferencial", "Serviço com prioridade destinado aos idosos, deficientes, etc...", 1);

insert into Servico (sigla, nomeSer, descricaoSer, statusSer) values("AGR", "Atendimento Geral", "Serviço para atendimento geral", 1);

insert into Servico (sigla, nomeSer, descricaoSer, statusSer) values("CSA", "Consulta Agendada", "Serviço destinado a consultas agendadas previamente", 1);

insert into Servico (sigla, nomeSer, descricaoSer, statusSer) values("RTE", "Retirada de Exames", "Serviço para a retiradas de exames relizados", 1);

insert into Prioridade (nomePri, descricaoPri, peso, statusPri, Servico_idServico) values ("Preferencial", "Preferencial", 1, 1, 1);

insert into Prioridade (nomePri, descricaoPri, peso, statusPri, Servico_idServico) values ("Normal", "Geral", 3, 1, 2);

insert into Prioridade (nomePri, descricaoPri, peso, statusPri, Servico_idServico) values ("Agendada", "Agendado Geral", 2, 1, 3);

insert into Prioridade (nomePri, descricaoPri, peso, statusPri, Servico_idServico) values ("Retirada", "Retirada Geral", 3, 1, 4);

insert into Senha (numeroSen, dataSen, horaSen, Prioridade_idPrioridade) values (1, curdate(), current_time(), 1);

select max(numeroSen) from Senha;

insert into Guiche (numeroGui, descricaoGui) values("AD1", "Guiche Principal");

insert into Funcionario (nomeFun, cpf, telefone, email, cargo, permissao, Guiche_idGuiche) 
values ("Administrador", "21020312007", "94512355", "admin@gmail.com", "Administrador", 1, 1);

insert into Usuario (usuario, senha, Funcionario_idFuncionario) values ("admin", "admin", 1);

insert into Funcionario (nomeFun, cpf, telefone, email, cargo, permissao, Guiche_idGuiche) 
values ("Atendente", "12345678990", "956798546", "atendente@gmail.com", "Atendente", 2, 1);

insert into Usuario (usuario, senha, Funcionario_idFuncionario) values ("atend", "atend", 2);

select * from Guiche;
select * from Servico;
select * from Funcionario;
select * from Prioridade;
select * from Usuario;
select * from Senha;

select sn.numeroSen, sn.dataSen, sn.horaSen, pr.nomePri, sr.sigla, sr.nomeSer from Senha sn 
inner join Prioridade pr on sn.Prioridade_idPrioridade = pr.idPrioridade
inner join Servico sr on pr.Servico_idServico = sr.idServico
order by sn.numeroSen desc limit 1;




