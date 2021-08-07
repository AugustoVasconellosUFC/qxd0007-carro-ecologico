public class Carro {

    private int passageiros = 0;

    private int tanque = 0;

    private int quilometragem = 0;

    public int getPassageiros() {
        return passageiros;
    }

    public int getCombustivel() {
        return tanque;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public boolean embarcar() {
        if(passageiros==2)
            return false;
        else {
            passageiros++;
            return true;
        }
    }

    public boolean desembarcar() {
        if(passageiros==0)
            return false;
        else {
            passageiros--;
            return true;
        }
    }

    public boolean dirigir(int distancia) {
        if(tanque<distancia) {
            quilometragem+=tanque;
            tanque=0;
            return false;
        }
        else {
            tanque-=distancia;
            quilometragem+=distancia;
            return true;
        }
    }

    public boolean abastecer(int quantidade) {
        if(quantidade<0)
            return false;
        else {
            tanque=Math.min(tanque+quantidade,100);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "passageiros=" + passageiros +
                ", combustivel=" + tanque +
                ", quilometragem=" + quilometragem +
                '}';
    }
}
