-- MySQL Workbench Forward Engineering

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
  `permissao` TINYINT NOT NULL,
  `Guiche_idGuiche` INT NOT NULL,
  PRIMARY KEY (`idFuncionario`),
    FOREIGN KEY (`Guiche_idGuiche`)
    REFERENCES `ma`.`Guiche` (`idGuiche`)
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
  `descricaoSer` VARCHAR(45) NULL,
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
  PRIMARY KEY (`idPrioridade`))
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
CREATE TABLE IF NOT EXISTS `ma`.`guiche` (
  `idGuiche` INT(11) NOT NULL AUTO_INCREMENT,
  `numeroGui` VARCHAR(10) NOT NULL,
  `descricaoGui` VARCHAR(90) NULL DEFAULT NULL,
  PRIMARY KEY (`idGuiche`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;