import static java.lang.IO.*;

void main() {

    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<String> idades = new ArrayList<>();
    ArrayList<String> cursos = new ArrayList<>();

    String opcao;
    int total = nomes.size();
//TODO Fazer uma variavel para controlar a quantidade de cadastros.


    do {
        println("===== SISTEMA DE CADASTRO DE ALUNOS =====");
        println("1 - Cadastrar aluno");
        println("2 - Listar alunos");
        println("3 - Buscar aluno pelo nome");
        println("4 - Remover aluno");
        println("5 - Sair");
        println("");

        opcao = readln("Digite a opcao desejada: ");

        println("");
        println("Opção escolhida: " + opcao);
        println("===============");


        if (opcao.equals("1")) {
            println("");
            println("Cadastrar aluno");
            println("");
            println("Cadastre ate 10 alunos ou digite pronto para terminar");
            println("");
            for (int i = 0; i < 10; i++) {
                String nome = readln("Qual o nome do " + (i + 1) + "° aluno(a): ");

                if (nome.isEmpty()){
                    println("ERRO: o nome do aluno não pode ficar vazio.");
                    i--;
                    continue;

                }else if (nome.equalsIgnoreCase("pronto")){
                    break;
                }

                String idade = readln("Qual a idade do " + (i + 1) + "° aluno(a): ");

                if (idade.isEmpty()){
                    println("ERRO: A idade do aluno não pode ficar vazia.");
                    i--;
                    continue;
                }

                int idade1 = Integer.parseInt(idade);

                if (idade1 <= 0) {
                    println("ERRO: idade inválida.");
                    i--;
                    continue;
                }

                String curso = readln("Qual o curso do " + (i + 1) + "° aluno(a): ");

                if (curso.isEmpty()){
                    println("O aluno deve estar matriculado em um curso !");
                    i--;
                    continue;

                }
                println("===============");

                nomes.add(nome);
                idades.add(idade);
                cursos.add(curso);
            }
        }

        if (opcao.equals("2")){
            if (nomes.isEmpty()){
                println("Nenhum aluno cadastrado !");
                println("");
            }else {
                for (int i = 0; i < nomes.size(); i++){
                    println((i + 1) + "° aluno(a)");
                    println("nome: " + nomes.get(i));
                    println("Idade: " + idades.get(i) + " anos");
                    println("Curso: " + cursos.get(i));
                    println("===============");

                }
                println("Total de alunos cadastrados: " + nomes.size());
                println("===============");
            }
        }

        if (opcao.equals("3")){
            println("Buscar aluno");
            String busca = readln("Insira o nome do aluno: ");

            int posicao = nomes.indexOf(busca);

            if (posicao != -1){
                println("aluno cadastrado !!!");
                println("===============");
                println("Cadastro do aluno:");
                println("===============");
                println("Matricula n° " + (posicao + 1));
                println("Nome: " + nomes.get(posicao));
                println("Idade: " + idades.get(posicao) + " anos");
                println("Curso: " + cursos.get(posicao));
            }else{
                println("Aluno nao cadastrado !!!");
            }
            println("===============");

        }

        if (opcao.equals("4")){
            println("Remover aluno");
            print("Nome do aluno: ");
            //TODO Criar um "apagar"
        }

        if (opcao.equals("5")){
            println("Fechando o programa !!!");
        }

        if (!opcao.matches("^[1-5]$")){
            println("");
            println("Opção invalida !!!");
            println("Escolha as opções de 1 a 5 !!!");
            println("");
        }

    }while(!opcao.equals("5"));
}
