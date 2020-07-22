package practice2.TaiwanID;

import java.util.Scanner;

public class TaiwanIDNumber {
    public static void main(String[] args) {
        //建立物件
        Scanner choose = new Scanner(System.in);
        idCardVerification idCheck = new idCardVerification();
        Greeting greeting = new Greeting();
        idCardProduce creatId = new idCardProduce();
        //歡迎詞
        greeting.hello();
        //判斷選擇服務
        while (choose.hasNext()) {
            switch (choose.nextLine()) {
                //隨機產生身份證
                case "1":
                    creatId.build(idCheck, greeting);
                    greeting.hello();
                    break;
                //驗證身份證
                case "2":
                    idCheck.idkeyin(greeting, choose);
                    greeting.hello();
                    break;
                //離開
                case "3":
                    return;
                //非服務選項
                default:
                    System.out.println("無此服務唷 還請您再次確認\n");
                    greeting.hello();
                    break;
            }

        }

    }
}
