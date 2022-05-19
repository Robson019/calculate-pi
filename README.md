# Calculate PI

O objetivo deste projeto é realizar o cálculo do valor de PI utilizando a linguagem de programação Java e calculando a velocidade do cálculo utilizando 1, 2, 4, 8, 16 e 32 threads. Para cada contexto (isto é, para cada número de threads), será demonstrado o tempo de execução de cada thread, a duração média de 5 execuções e o desvio-padrão do conjunto de dados.

## Exemplo explicado do resultado da execução do programa:

```bash
Calculando com 1 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 1 thread na 1ª execução
Duração[1]: 36ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 1 thread na 2ª execução
Duração[2]: 32ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 1 thread na 3ª execução
Duração[3]: 31ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 1 thread na 4ª execução
Duração[4]: 33ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 1 thread na 5ª execução
Duração[5]: 32ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
1 - Duração média: 33,29ms # duração média das 5 execuções do cálculo de pi com 1 thread
1 - Desvio Padrão: 0,77ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================
Calculando com 2 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 2 threads na 1ª execução
Duração[1]: 17ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 2 threads na 2ª execução
Duração[2]: 16ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 2 threads na 3ª execução
Duração[3]: 16ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 2 threads na 4ª execução
Duração[4]: 16ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 2 threads na 5ª execução
Duração[5]: 18ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
2 - Duração média: 17,13ms # duração média das 5 execuções do cálculo de pi com 2 threads
2 - Desvio Padrão: 0,63ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================
Calculando com 4 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 4 threads na 1ª execução
Duração[1]: 9ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 4 threads na 2ª execução
Duração[2]: 12ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 4 threads na 3ª execução
Duração[3]: 9ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 4 threads na 4ª execução
Duração[4]: 12ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 4 threads na 5ª execução
Duração[5]: 12ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
4 - Duração média: 11,21ms # duração média das 5 execuções do cálculo de pi com 4 threads
4 - Desvio Padrão: 0,77ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================
Calculando com 8 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 8 threads na 1ª execução
Duração[1]: 6ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 8 threads na 2ª execução
Duração[2]: 7ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 8 threads na 3ª execução
Duração[3]: 7ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 8 threads na 4ª execução
Duração[4]: 6ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 8 threads na 5ª execução
Duração[5]: 6ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
8 - Duração média: 7,13ms # duração média das 5 execuções do cálculo de pi com 8 threads
8 - Desvio Padrão: 0,63ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================
Calculando com 16 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 16 threads na 1ª execução
Duração[1]: 7ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 16 threads na 2ª execução
Duração[2]: 6ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 16 threads na 3ª execução
Duração[3]: 7ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 16 threads na 4ª execução
Duração[4]: 8ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 16 threads na 5ª execução
Duração[5]: 7ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
16 - Duração média: 7,52ms # duração média das 5 execuções do cálculo de pi com 16 threads
16 - Desvio Padrão: 0,00ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================
Calculando com 32 thread(s)
===========================
Valor pi: 3,141592 # valor calculado com 32 threads na 1ª execução
Duração[1]: 7ms # tempo necessário para calcular o valor de pi na 1ª execução
===========================
Valor pi: 3,141592 # valor calculado com 32 threads na 2ª execução
Duração[2]: 7ms # tempo necessário para calcular o valor de pi na 2ª execução
===========================
Valor pi: 3,141592 # valor calculado com 32 threads na 3ª execução
Duração[3]: 7ms # tempo necessário para calcular o valor de pi na 3ª execução
===========================
Valor pi: 3,141592 # valor calculado com 32 threads na 4ª execução
Duração[4]: 7ms # tempo necessário para calcular o valor de pi na 4ª execução
===========================
Valor pi: 3,141592 # valor calculado com 32 threads na 5ª execução
Duração[5]: 9ms # tempo necessário para calcular o valor de pi na 5ª execução
===========================
32 - Duração média: 7,91ms # duração média das 5 execuções do cálculo de pi com 32 threads
32 - Desvio Padrão: 0,45ns # desvio-padrão entre as 5 durações calculadas (em nanossegundos)
===========================

```

## Conclusões

Podemos perceber que, conforme o número de threads utilizadas aumenta, o tempo necessário para se calcular o valor de pi diminui. Porém, se pararmos para analisar o tempo médio de execução do cálculo de pi com 8, 16 e 32 threads, repectivamente, vamos notar um comportamento anômalo: a duração média está aumentando, e não diminuindo, como era de se esperar (já que temos mais linhas de execução dividindo o trabalho). Com 8 threads o tempo de execução médio foi `7,13ms`, com 16 foi `7,52ms` e com 32 foi `7,91ms`. Porque isso acontece? Uma possível explicação é que não necessariamente quanto mais threads você colocar para trabalhar vai refletir em um trabalho mais rápido. Isso se dá pelo fato de que há tantos processos competindo pelo processador que acaba ocorrendo muito mais trocas de contexto e demora mais para uma thread voltar a ter o processador para si.

## Informações complementares

- **Instituição:** IFAL - Campus Arapiraca
- **Turma:** 3° período de Sistemas de Informação
- **Disciplina:** Sistemas Operacionais
- **Colaboradores:**
    - Felipe da Silva Santos
    - Robson Alves Gominho

