# Tarea 09-B

Antuan Herrera Icaza - DAM2

Hice cuatro pociones: aprobado, honestidad, esfuerzo y trabajo. Cada una se prepara en un hilo. Las fases y el tiempo de cada fase salen al azar al crearla.

Alquimista arranca los cuatro hilos y, cuando acaban, muestra los tiempos.

Para probarlo abro Alquimista y luego lo ejecuto.

Ejecución tres veces:

| Ejecución | Poción más lenta (fases × ms) | Tiempo real (ms) | Suma (ms) |
|---|---|---:|---:|
| 1 | aprobado (7 × 391) | 2756 | 7665 |
| 2 | honestidad (5 × 329) | 1663 | 5929 |
| 3 | esfuerzo (8 × 368) | 2968 | 7976 |

Los tiempos cambian en cada prueba. El tiempo real se parece al de la poción más lenta porque las cuatro se preparan a la vez.

Uso de IA: He usado ia para entender el enunciado, revisar el código para verificar de que todo esté correcto y para crear una tabla con las pruebas.



PROMPTS:

- Explícame paso a paso que es lo que pide este pdf.
- El enunciado dice que las pociones son aprobado, honestidad, esfuerzo y trabajo. ¿Por qué en el ejemplo de salida aparece juventud?
- Revisa este código y dime si está todo bien según el pdf, si me falta algo indícamelo, (código de "Pocion.java" y "Alquimista.java").
- Ejecuta el programa tres veces y pon los resultados reales en una tabla en el README.