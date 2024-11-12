package projeto_bichinho;

// Classe Animal que representa o bichinho virtual
class Animal {
    private String nome;
    private String classe;
    private String familia;
    private int idade;
    private boolean vivo;
    private int caloria;
    private int forca;

    // Construtor para inicializar o bichinho
    public Animal(String nome, String classe, String familia) {
        this.nome = nome;
        this.classe = classe;
        this.familia = familia;
        this.idade = 0;
        this.vivo = true;
        this.caloria = 10;
        this.forca = 10;
    }

    // Métodos de acesso para cada atributo
    public boolean isVivo() {
        return vivo;
    }

    public int getCaloria() {
        return caloria;
    }

    public int getForca() {
        return forca;
    }

    // Método para o bichinho comer
    public void comer() {
        if (!vivo) {
            System.out.println(nome + " está morto e não pode comer.");
            return;
        }
        if (caloria < 100) {
            caloria = Math.min(caloria + 10, 100);
            forca = Math.max(forca - 2, 0);
            System.out.println(nome + " comeu! Força: " + forca + ", Calorias: " + caloria);
        } else {
            System.out.println(nome + " está cheio e não pode comer mais.");
        }
    }

    // Método para o bichinho correr
    public void correr() {
        if (!vivo) {
            System.out.println(nome + " está morto e não pode correr.");
            return;
        }
        if (caloria > 0 && forca > 0) {
            forca = Math.max(forca - 5, 0);
            caloria = Math.max(caloria - 5, 0);
            System.out.println(nome + " está correndo! Força: " + forca + ", Calorias: " + caloria);
        } else {
            System.out.println(nome + " está exausto e não pode correr.");
        }
    }

    // Método para o bichinho dormir
    public void dormir() {
        if (!vivo) {
            System.out.println(nome + " está morto e não pode dormir.");
            return;
        }
        forca = Math.min(forca + 10, 100);
        caloria = Math.max(caloria - 2, 0);
        System.out.println(nome + " está dormindo! Força: " + forca + ", Calorias: " + caloria);
    }

    // Método para o bichinho morrer
    public void morrer() {
        vivo = false;
        forca = 0;
        System.out.println(nome + " morreu!");
    }

    // Método para exibir o estado atual do bichinho
    public void exibirStatus() {
        System.out.println("Nome: " + nome + ", Classe: " + classe + ", Família: " + familia);
        System.out.println("Idade: " + idade + ", Vivo: " + vivo + ", Calorias: " + caloria + ", Força: " + forca);
    }
}

