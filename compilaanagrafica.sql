CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `stock06_08_2019`.`compilaanagrafica` AS
    SELECT 
        `stock06_08_2019`.`cliente`.`Nome` AS `nome`,
        `stock06_08_2019`.`cliente`.`Cognome` AS `cognome`,
        `stock06_08_2019`.`cliente`.`Telefonocasa` AS `telefonocasa`,
        `stock06_08_2019`.`cliente`.`Telefonocellulare` AS `telefonocellulare`,
        `stock06_08_2019`.`cliente`.`Email` AS `email`,
        `stock06_08_2019`.`cliente`.`Datanascita` AS `datanascita`,
        `stock06_08_2019`.`cliente`.`INDIRIZZO` AS `indirizzo`
    FROM
        `stock06_08_2019`.`cliente`