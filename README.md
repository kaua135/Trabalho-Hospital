# Fila de Prioridade com Heap Binário

## Descrição

Este projeto implementa uma fila de prioridade utilizando Heap Binário em Java.

A aplicação simula o sistema de triagem do Hospital São Binário, onde os pacientes são atendidos conforme regras de prioridade clínica.

A prioridade dos pacientes é definida pelos seguintes critérios:

1. Maior nível de urgência
2. Maior tempo de espera
3. Grupo vulnerável possui prioridade em caso de empate

---

# Estrutura do Projeto

```text
src/
│
├── entidades/
│   └── Paciente.java
│
├── estatica/
│   ├── FilaEstatica.java
│   └── FilaComPrioridadeHeap.java
│
└── Main.java
```

---

# Tecnologias Utilizadas

* Java 17
* Heap Binário
* Programação Orientada a Objetos

---

# Compilar

```bash
javac -d out src/entidades/Paciente.java src/estatica/FilaEstatica.java src/estatica/FilaComPrioridadeHeap.java src/Main.java
```

---

# Executar

```bash
java -cp out Main
```

---

# Gerar Javadoc

```bash
javadoc -d doc -sourcepath src -subpackages estatica:entidades
```

Abrir a documentação:

```text
doc/index.html
```

---

# Funcionamento do Heap

## Inserção

Ao inserir um novo paciente:

1. O elemento é adicionado ao final do heap
2. O algoritmo Sobe Heap reorganiza a estrutura

## Remoção

Ao remover um paciente:

1. A raiz do heap é removida
2. O último elemento sobe para a raiz
3. O algoritmo Desce Heap reorganiza o heap

---

# Pacientes Utilizados no Teste

| Nome    | Urgência | Espera | Vulnerável |
| ------- | -------- | ------ | ---------- |
| Carlos  | 2        | 45 min | Não        |
| Maria   | 5        | 5 min  | Não        |
| João    | 3        | 20 min | Não        |
| Beatriz | 3        | 35 min | Sim        |
| Pedro   | 5        | 2 min  | Não        |
| Helena  | 2        | 45 min | Sim        |

---

# Ordem Esperada de Atendimento

```text
Maria
Pedro
Beatriz
João
Helena
Carlos
```

---

# Autor

Projeto desenvolvido para a disciplina de Estrutura de Dados.
