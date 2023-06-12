
package ProjetoUSJT;

public class CadastroUsuario {
    
   private String Nome_Completo;
   private String Data_Nascimento;
   private String Email;
   private String RG;
   private String CPF;
   private String Endereço;
   private String CEP;
   private String Cidade;
   private String UF;
   private String Telefone;

    public CadastroUsuario(String Nome_Completo, String Data_Nascimento, String Email, String RG, String CPF, String cep, String Endereço, String CEP, String Cidade, String UF, String Telefone) {
        this.Nome_Completo = Nome_Completo;
        this.Data_Nascimento = Data_Nascimento;
        this.Email = Email;
        this.RG = RG;
        this.CPF = CPF;
        this.Endereço = Endereço;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.UF = UF;
        this.Telefone = Telefone;
    }

    public CadastroUsuario(String CPF) {
        this.CPF = CPF;
    }

    public String getNome_Completo() {
        return Nome_Completo;
    }

    public void setNome_Completo(String Nome_Completo) {
        this.Nome_Completo = Nome_Completo;
    }

    public String getData_Nascimento() {
        return Data_Nascimento;
    }

    public void setData_Nascimento(String Data_Nascimento) {
        this.Data_Nascimento = Data_Nascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
   
}
