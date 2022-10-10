package br.com.contasapagar;
import javax.persistence.*;
import java.time.LocalDate;


@Entity // Define essa classe como uma entidade ou seja, como uma tabela de banco de dados
@Table(name = "a_pagar")
public class Conta {

    @Id // Diz que "public Integer id;" é um campo da entidade "public class ContasModel", e nesse caso é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String descricao_conta; //@Column(length = 80)//Diz que "descricao" é uma coluna de "ContasModel", não pode ser nulo e aceita ate 80 caracteres.

    public LocalDate data_vencimento;

    public Float valor;

    public String baixado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao_conta() {
        return descricao_conta;
    }

    public void setDescricao_conta(String descricao_conta) {
        this.descricao_conta = descricao_conta;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getBaixado() {
        return baixado;
    }

    public void setBaixado(String baixado) {
        this.baixado = baixado;
    }
}
