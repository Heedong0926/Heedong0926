SET @HOUR := -1;

SELECT (@HOUR := @HOUR +1) AS HOUR,
    (SELECT COUNT(*) FROM ANIMAL_OUTS where HOUR(DATETIME) = @HOUR) as COUNT
FROM ANIMAL_OUTS
WHERE @HOUR < 23;
