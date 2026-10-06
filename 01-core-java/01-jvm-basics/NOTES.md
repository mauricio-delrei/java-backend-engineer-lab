conceitos do Dia 1;
perguntas e respostas;
comandos utilizados;
resultados dos experimentos;
suas próprias explicações depois de praticar.

## My own explanation

9. INTERVIEW — PT-BR

Agora a parte para você memorizar e praticar em voz alta.

Pergunta 1
Qual a diferença entre JVM, JRE e JDK?

Resposta PT-BR:

A JVM é responsável por executar o bytecode Java. O JRE representa o ambiente de runtime, incluindo a JVM e as bibliotecas necessárias para executar aplicações. O JDK é o kit de desenvolvimento, que inclui o runtime e ferramentas como javac, javap e jcmd. Como desenvolvedor, normalmente trabalho com o JDK.

Pergunta 2
O que acontece quando você compila uma aplicação Java?

Resposta PT-BR:

O código-fonte .java é compilado pelo javac para bytecode, gerando arquivos .class. Esses arquivos são executados pela JVM. Durante a execução, a JVM pode utilizar o JIT compiler para transformar código frequentemente executado em código nativo da máquina.

Pergunta 3
Qual a diferença entre Stack e Heap?

Resposta PT-BR:

A stack é específica de cada thread e contém stack frames das chamadas de métodos, incluindo variáveis locais e operand stack. A heap é compartilhada entre as threads e é onde os objects e arrays são geralmente alocados. A stack é liberada automaticamente conforme os métodos retornam, enquanto a memória da heap é gerenciada pelo Garbage Collector.

Pergunta 4
O que acontece em Person person = new Person("John");?

Resposta PT-BR:

O new cria um novo object Person, geralmente alocado na heap. A variável person contém uma reference para esse object. A variável local está associada ao stack frame do método atual.

Pergunta 5
Qual a diferença entre primitive e reference?

Resposta PT-BR:

Um primitive representa directamente um valor, como um int ou boolean. Uma reference representa uma referência para um object, ou pode ser null. Para primitives, == compara valores; para references, == verifica identidade, ou seja, se representam o mesmo object.

Pergunta 6
Java é pass-by-value ou pass-by-reference?

Resposta PT-BR:

Java é sempre pass-by-value. Quando passamos um object para um método, o valor da reference é copiado. Assim, o método e o chamador podem ter references diferentes apontando para o mesmo object. Por isso o método pode modificar o object, mas se reatribuir o parâmetro para outro object, essa reatribuição não afecta a variável do chamador.

Pergunta 7
Quando um object fica elegível para Garbage Collection?

Resposta PT-BR:

Um object fica elegível para Garbage Collection quando deixa de ser alcançável a partir dos GC roots. Isso não significa que será imediatamente colectado. Significa apenas que o Garbage Collector pode recuperar aquela memória quando decidir executar a coleta.

Pergunta 8
Java pode ter memory leaks?

Resposta PT-BR:

Sim. O Garbage Collector só pode recuperar objects que não são mais alcançáveis. Se uma aplicação mantém referências desnecessárias, por exemplo através de uma static collection, cache ou listener, esses objects continuam alcançáveis e podem consumir memória indefinidamente.

10. INTERVIEW — BRITISH ENGLISH

Estas são as respostas que eu recomendo você praticar literalmente no início. Depois vamos fazê-lo responder sem decorar.

1. What is the difference between the JVM, JRE and JDK?

The JVM is responsible for executing Java bytecode. The JRE represents the runtime environment, including the JVM and the libraries required to run Java applications. The JDK is the development kit, which includes the runtime and development tools such as javac, javap and jcmd. As a developer, I normally work with the JDK.

2. What happens when you compile a Java application?

The Java source code is compiled by javac into bytecode, producing .class files. The bytecode is then executed by the JVM. At runtime, the JVM can use the JIT compiler to compile frequently executed code into native machine code.

3. What is the difference between the stack and the heap?

The stack is specific to each thread and contains stack frames for method calls, including local variables and the operand stack. The heap is shared between threads and is where objects and arrays are generally allocated. Stack frames are released as methods return, while heap memory is managed by the Garbage Collector.

4. What happens in Person person = new Person("John");?

The new operator creates a new Person object, which is generally allocated on the heap. The local variable person holds a reference to that object, and that local variable is associated with the current method's stack frame.

5. What is the difference between a primitive and a reference type?

A primitive represents a value directly, such as an int or a boolean. A reference represents a reference to an object, or it can be null. For primitives, == compares values. For references, == checks object identity, meaning whether the references represent the same object.

6. Is Java pass-by-value or pass-by-reference?

Java is always pass-by-value. When an object is passed to a method, the value of the reference is copied. This means the method and the caller can have different references pointing to the same object. Therefore, the method can mutate the object, but if it reassigns the parameter to another object, that reassignment does not affect the caller's variable.

7. When does an object become eligible for garbage collection?

An object becomes eligible for garbage collection when it is no longer reachable from any GC root. However, being eligible does not mean that it is collected immediately. It simply means that the Garbage Collector can reclaim its memory when it decides to do so.

8. Can Java applications have memory leaks?

Yes. The Garbage Collector can only reclaim objects that are no longer reachable. If an application keeps unnecessary references, for example through a static collection, a cache or a listener, those objects remain reachable and can consume memory indefinitely.