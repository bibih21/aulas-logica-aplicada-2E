public class Produto {
    //Atributo
    boolean diet;
    private String nome;
    double preco;
    //Setter
    public void setNome(String _nome) {
        this.nome = _nome;
    }
    //Método construtor padrão
    Produto (){}
    //Sobrecarga em método
    Produto(double _preco){
    this.preco = _preco;
    }

public Produto(String _nome,double _preco){
this.nome = _nome;
this.preco = _preco;
        }
        }
