public class Aluno {

  String name;
  String genero;
  float altura;
  float peso;
  int birthdateYear;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public float getPeso() {
    return peso;
  }

  public void setPeso(float peso) {
    this.peso = peso;
  }

  public int getBirthdateYear() {
    return birthdateYear;
  }

  public void setBirthdateYear(int birthdateYear) {
    this.birthdateYear = birthdateYear;
  }

  public String verificaPesoIdeal() {
    if (genero.equalsIgnoreCase("masculino")) {
      double pesoIdeal = (72.7 * altura) - 58;
      return ("M - Seu peso ideal é: " + pesoIdeal);
    } else if (genero.equalsIgnoreCase("feminino")) {
      double pesoIdeal = (62.1 * altura) - 44.7;
      return ("F - Seu peso ideal é: " + pesoIdeal);
    } else {
      return ("Genero indisponivel!");
    }
  }

  public int calculaIdade() {
    return(2020-birthdateYear);
  }
}
