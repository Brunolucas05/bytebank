public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoBruno = new Conta();

        contaDoBruno.saldo = 100;
        contaDoBruno.deposita(50);
        System.out.println(contaDoBruno.saldo);
        contaDoBruno.saca(20);
        System.out.println(contaDoBruno.saldo);

        Conta contaDoBiel = new Conta();
        contaDoBiel.deposita(1000);

        if(contaDoBiel.transfere(300, contaDoBruno)) {
            System.out.println("Transferencia com sucesso");
        }else {
            System.out.println("Saldo insuficiente para transferencia");
        }
        System.out.println(contaDoBiel.saldo);

        System.out.println(contaDoBruno.saldo);
    }
}

