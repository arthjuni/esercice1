CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `stock06_08_2019`.`viewinfoaccesso` AS
    SELECT 
        `stock06_08_2019`.`punto_vendita`.`NomeP` AS `nomeP`,
        `stock06_08_2019`.`lavoratore`.`Nome` AS `nome`,
        `stock06_08_2019`.`lavoratore`.`Cognome` AS `cognome`,
        `stock06_08_2019`.`accesso`.`Utente` AS `utente`,
        `stock06_08_2019`.`accesso`.`password` AS `password`
    FROM
        ((`stock06_08_2019`.`punto_vendita`
        JOIN `stock06_08_2019`.`lavoratore`)
        JOIN `stock06_08_2019`.`accesso`)
    WHERE
        ((`stock06_08_2019`.`punto_vendita`.`CodPuntVendita` = `stock06_08_2019`.`lavoratore`.`PUNTO_VENDITA_CodPuntVendita`)
            AND (`stock06_08_2019`.`lavoratore`.`CodLavoratore` = `stock06_08_2019`.`accesso`.`LAVORATORE_CodLavoratore`))