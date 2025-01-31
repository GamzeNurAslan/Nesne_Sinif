interface Egitim{
public void Calis();
}
interface Insan{
public void Dusun();
}
abstract class Sosyal{
abstract public void GrupKur();
}
abstract class Ogrenci implements Insan,Egitim{
abstract public void Dinle();
}
class Ogretmen extends Sosyal implements Insan{
public void Dusun(){}
public void GrupKur(){}
public void Anlat(){}
}
class YLisanOgrenci extends Ogrenci{
public void Arastir(){}
public void OdevYap(){}
public void Dinle(){}
public void Calis(){}
public void Dusun(){}
}
class Arasgor extends Ogretmen implements Egitim{
public void Arastir(){}
public void ProjeYap(){}
public void Calis(){}
}
public class Main{
public static void main(String [] args){}
}
