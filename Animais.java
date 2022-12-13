
public class Animais {
    // Atributos dos animais
    int  faixadeIdade;
    double tempoAteSangria;
    double tempoDeSangria;
       
    // Atributos da insensibilização
    int numInsensibilizacao;
    boolean qualidadeDaInsens;
    boolean houveSinaisObservadosNoAnimal;
    int numeroDeSinaisPorAnimal;

    // Atributos de controle de insensibilzação
    boolean sinais;
    boolean vocalizacao;
    boolean respiracao;
    boolean postura;
    boolean oculares;
    boolean dolorosos;

    //contusões maiores que 5cm 
    boolean contusao;
    int traseiro;
    int dianteiro;
    int costela;

    //Observações sobre qqr coisa
    String observacoes;

public Animais(){

}
    public int getFaixadeIdade() {
        return faixadeIdade;
    }
    public void setFaixadeIdade(int faixadeIdade) {
        this.faixadeIdade = faixadeIdade;
    }
    public double getTempoAteSangria() {
        return tempoAteSangria;
    }
    public void setTempoAteSangria(double tempoAteSangria) {
        this.tempoAteSangria = tempoAteSangria;
    }
    public double getTempoDeSangria() {
        return tempoDeSangria;
    }
    public void setTempoDeSangria(double tempoDeSangria) {
        this.tempoDeSangria = tempoDeSangria;
    }
    public int getNumInsensibilizacao() {
        return numInsensibilizacao;
    }
    public void setNumInsensibilizacao(int numInsensibilizacao) {
        this.numInsensibilizacao = numInsensibilizacao;
    }
    public boolean isQualidadeDaInsens() {
        return qualidadeDaInsens;
    }
    public void setQualidadeDaInsens(boolean qualidadeDaInsens) {
        this.qualidadeDaInsens = qualidadeDaInsens;
    }
    public boolean isHouveSinaisObservadosNoAnimal() {
        return houveSinaisObservadosNoAnimal;
    }
    public void setHouveSinaisObservadosNoAnimal() {
        this.houveSinaisObservadosNoAnimal = true;
    }
    public int getNumeroDeSinaisPorAnimal() {
        return numeroDeSinaisPorAnimal;
    }
    public void setNumeroDeSinaisPorAnimal(int numeroDeSinaisPorAnimal) {
        this.numeroDeSinaisPorAnimal = numeroDeSinaisPorAnimal;
    }
    public boolean isSinais() {
        return sinais;
    }
    public void setSinais(boolean sinais) {
        this.sinais = sinais;
    }
    public boolean isVocalizacao() {
        return vocalizacao;
    }
    public void setVocalizacao(boolean vocalizacao) {
        this.vocalizacao = vocalizacao;
    }
    public boolean isRespiracao() {
        return respiracao;
    }
    public void setRespiracao(boolean respiracao) {
        this.respiracao = respiracao;
    }
    public boolean isPostura() {
        return postura;
    }
    public void setPostura(boolean postura) {
        this.postura = postura;
    }
    public boolean isOculares() {
        return oculares;
    }
    public void setOculares(boolean oculares) {
        this.oculares = oculares;
    }
    public boolean isDolorosos() {
        return dolorosos;
    }
    public void setDolorosos(boolean dolorosos) {
        this.dolorosos = dolorosos;
    }
    public boolean isContusao() {
        return contusao;
    }
    public void setContusao(boolean contusao) {
        this.contusao = contusao;
    }
    public int getTraseiro() {
        return traseiro;
    }
    public void setTraseiro(int traseiro) {
        this.traseiro = traseiro;
    }
    public int getDianteiro() {
        return dianteiro;
    }
    public void setDianteiro(int dianteiro) {
        this.dianteiro = dianteiro;
    }
    public int getCostela() {
        return costela;
    }
    public void setCostela(int costela) {
        this.costela = costela;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
   
    
       
}
