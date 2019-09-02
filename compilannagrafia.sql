CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `stock06_08_2019`.`voirdb` AS
    SELECT 
        `stock06_08_2019`.`cliente`.`Cognome` AS `cognome`,
        `stock06_08_2019`.`cliente`.`Nome` AS `nome`
    FROM
        `stock06_08_2019`.`cliente`