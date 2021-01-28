/*
 * ALUNOS: 
 * ANDERSON ANSELMI NUNES       - RA 1430481923044
 * VICTOR PEREIRA NASCIMENTO    - RA 1430481923059
*/

/* Exercicio 1
 * Implemente a hierarquia de classes representado no diagrama a seguir. Note que as classes representadas são “pojo”s, isto é, 
 * não é necessário criar métodos específicos, só utilizar herança adequadamente para reaproveitamento de código. 
 * Não se esqueça de uma classe de testes para instanciar cada objeto e exibir.
*/

package heranca;

// class Pessoa
public class Pessoa {

    private String nome;
    private int idade;
    private String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setEndereco(endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

// class Aluno
package heranca;

class Aluno extends Pessoa {

	private String semestre;
	private String curso;

	public Aluno(String nome, int idade, String endereco, String semestre, String curso) {
		super(nome, idade, endereco);
		this.semestre = semestre;
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}

// class Funcionario
package heranca;

class Funcionario extends Pessoa {

	private double salario;

	public Funcionario(String nome, int idade, String endereco, double salario) {
		super(nome, idade, endereco);
		this.setSalario(salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}

// class Professor
package heranca;

class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, int idade, String endereco, double salario, String disciplina) {
        super(nome, idade, endereco, salario);
        this.setDisciplina(disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}

// class FuncAdm
package heranca;

class FuncAdm extends Funcionario {

    private String setor;
    private String funcao;

    public FuncAdm(String nome, int idade, String endereco, double salario, String setor, String funcao) {
        super(nome, idade, endereco, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}

// class Teste
package heranca;

public class TesteHeranca {
    public static void main(String[] args) {
        // instancia os objetos
        Aluno aluno = new Aluno("Anderson", 48, "Av. Marginal 1455", "3", "ADS");
        Professor professor = new Professor("Andrea Machion", 20, "Av. não sei", 10000.00, "Estrutura de Dados");
        Funcionario funcionario = new Funcionario("Ze Chapeu de Aluminio", 25, "Av. Ioio 1234", 1250.00);
        FuncAdm funcAdm = new FuncAdm("Vanessa", 60, "Rua Jurupupu 69", 2250.00, "secretaria", "Coordenadora");

        // exibe o resultado da classe Alunos
        System.out.println("\n\nVeja como os atributos da classe Alunos foram preenchidos\n");
        System.out.println("Nome: " + aluno.getNome());
		System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Endereco: " + aluno.getEndereco().toString());
        System.out.println("Semestre: " + aluno.getSemestre().toString());
        System.out.println("Curso: " + aluno.getCurso().toString());
        System.out.println("\n********************************************************\n");

        // exibe o resultado da classe Professor
        System.out.println("\nVeja como os atributos da classe Professor foram preenchidos\n");
        System.out.println("Nome: " + professor.getNome());
		System.out.println("Idade: " + professor.getIdade());
        System.out.println("Endereco: " + professor.getEndereco().toString());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Disciplina: " + professor.getDisciplina().toString());
        System.out.println("\n********************************************************\n");

        // exibe o resultado da classe Funcionario
        System.out.println("\nVeja como os atributos da classe Funcionario foram preenchidos\n");
        System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Idade: " + funcionario.getIdade());
        System.out.println("Endereco: " + funcionario.getEndereco().toString());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("\n********************************************************\n");

        // exibe o resultado da classe FuncAdm
        System.out.println("\nVeja como os atributos da classe FuncAdm foram preenchidos\n");
        System.out.println("Nome: " + funcAdm.getNome());
		System.out.println("Idade: " + funcAdm.getIdade());
        System.out.println("Endereco: " + funcAdm.getEndereco().toString());
        System.out.println("Salário: " + funcAdm.getSalario());
        System.out.println("Setor: " + funcAdm.getSetor().toString());
        System.out.println("Função: " + funcAdm.getFuncao().toString());
        System.out.println("\n********************************************************\n");
    }
}



/* Exercicio 2
 * Considere uma classe para representar figuras geométricas. Toda figura tem a sua fórmula específica para calcular área e perímetro. 
 * Acrescente à sua hierarquia de classes as figuras retângulo, círculo e triângulo, 
 * cada uma com seu conjunto próprio de atributos e métodos apropriados para os referidos cálculos. 
 * Crie uma classe de testes e verifique o funcionamento, utilizando um vetor de figuras.
*/

package FiguraGeometrica;

public abstract class FigGeometrica {

    // metodos publicos que vao ser herdados
    public abstract double calculaPerimetro();
    public abstract double calculaArea();

}

// class Retangulo
package FiguraGeometrica;

public class Retangulo extends FigGeometrica {
    
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    // construtor
    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return 2 * this.getBase() + 2 * this.getAltura();
    }

    // calcula a area
    public double calculaArea(){
        return this.getBase() * this.getAltura();
    }
}

// class Circulo
package FiguraGeometrica;

public class Circulo extends FigGeometrica {
    
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return 2 * Math.PI * this.getRaio();
    }

    // calcula a area
    public double calculaArea(){
        return Math.PI * this.getRaio() * this.getRaio();
    }
}

// class Triangulo
package FiguraGeometrica;

public class Triangulo extends FigGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getLado1(){
        return this.lado1;
    }

    public double getLado2(){
        return this.lado2;
    }

    public double getLado3(){
        return this.lado3;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public void setLado3(double lado3){
        this.lado3 = lado3;
    }

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base 	= base;
        this.altura = altura;
        this.lado1 	= lado1;
        this.lado2 	= lado2;
        this.lado3 	= lado3;
    }

    // calcula o perimetro
    public double calculaPerimetro(){
        return this.getLado1() + this.getLado2() + this.getLado3();
    }

    // calcula a area
    public double calculaArea(){
        return (this.getBase() * this.getAltura()) / 2;
    }
}

// class Teste
package FiguraGeometrica;

public class TesteFigGeom {
    public static void main(String[] args) {
        // instancia os objetos
        Retangulo retangulo = new Retangulo(20, 20);
        Circulo circulo = new Circulo(15);
        Triangulo triangulo = new Triangulo(12, 12, 6, 6, 6);

        // exibe os resultados
        System.out.println("\nResultados dos cálculos: \n");
        System.out.println("Perimetro do Retangulo: " + retangulo.calculaPerimetro());
        System.out.println("Area do Retangulo: " + retangulo.calculaArea());
        System.out.println("\n*********************************************\n");

        System.out.println("Perimetro do Círculo: " + circulo.calculaPerimetro());
        System.out.println("Area do Círculo: " + circulo.calculaArea());
        System.out.println("\n*********************************************\n");
        
        System.out.println("Perimetro do Triangulo: " + triangulo.calculaPerimetro());
        System.out.println("Area do Triangulo: " + triangulo.calculaArea());
        System.out.println("\n*********************************************\n");
    }
}

