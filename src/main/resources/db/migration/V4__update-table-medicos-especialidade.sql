UPDATE medicos SET especialidade = CASE especialidade
    WHEN 0 THEN 'ORTOPEDIA'
    WHEN 1 THEN 'CARDIOLOGIA'
    WHEN 2 THEN 'GINECOLOGIA'
    WHEN 3 THEN 'DERMATOLOGIA'
END
