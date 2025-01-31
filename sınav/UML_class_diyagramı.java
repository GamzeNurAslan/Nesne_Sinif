interface Calisan{
public void mesaiyeBasla();
public void calis();
public void mesaiyiBitir();
}
abstract class Yonetici implements Calisan{
public void toplantiYap(){}
}
abstract class Programci implements Calisan{
public void programYaz(){}
}
class Mudur extends Yonetici{
public void cayic(){}
public void toplantiYap(){}
public void mesaiyeBasla(){}
public void mesaiyiBitir(){}
public void calis(){}
}
class Sef extends Yonetici{
public void imzaAt(){}
public void toplantiYap(){}
public void mesaiyeBasla(){}
public void mesaiyiBitir(){}
public void calis(){}
}
class JavaProgramci extends Programci{
public void kahveic(){}
public void programYaz(){}
public void mesaiyeBasla(){}
public void mesaiyiBitir(){}
public void calis(){}
}
class CppProgramci extends Programci{
public void suic(){}
public void programYaz(){}
public void mesaiyeBasla(){}
public void mesaiyiBitir(){}
public void calis(){}
}
public class Main{
public static void main(String [] args){
}
}
