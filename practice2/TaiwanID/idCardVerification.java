package practice2.TaiwanID;

import java.util.Scanner;

//確認ID
public class idCardVerification {
    //ID組成規則
    private String idpattern = "[A-Za-z][1-2][0-9]{8}";
    private String id;
    //出生地
    private String location;
    //陣列 放身分證字號
    private int ary[] = new int[10];
    private int select = 0;

    /**
     * 判斷輸入的ID是否符合身分證編碼規則
     * @param greeting  顯示的內容
     * @param choose    要求輸入的內容
     */
    public void idkeyin(Greeting greeting, Scanner choose) {
        greeting.myId();
        while (choose.hasNext()) {
            id = choose.nextLine().toUpperCase();
            //符合的話就開始計算是否為有效ID
            if (id.matches(idpattern)) {
                correctid(id, greeting, select);
                return;
            } else {
                System.out.println("格式錯誤唷，請在確認");
                greeting.myId();
            }
        }

    }

    /**
     * 驗證是否為有效ID
     * @param id    輸入的身份證字號
     * @param greeting  顯示的內容
     * @param select    判斷是驗證或產生器
     * @return
     */
    public int[] correctid(String id, Greeting greeting, int select) {
        int sum = 0;
        //換算英文字的數字
        int digit;
        int tensdigit;
        int firstletter;
        // 利用迴圈，依序讀取字串的每一個字元
        for (int i = 1; i < id.length(); i++) {
            // 將捉到的字元轉為整數，存入陣列
            ary[i] = Integer.parseInt(id.substring(i, i + 1));
        }
        //將字母轉換成數字並計算總合
        switch (id.substring(0, 1)) {
            case "A":
                ary[0] = 10;
                location = "臺北市";
                break;
            case "B":
                ary[0] = 11;
                location = "臺中市";
                break;
            case "C":
                ary[0] = 12;
                location = "基隆市";
                break;
            case "D":
                ary[0] = 13;
                location = "臺南市";
                break;
            case "E":
                ary[0] = 14;
                location = "高雄市";
                break;
            case "F":
                ary[0] = 15;
                location = "新北市";
                break;
            case "G":
                ary[0] = 16;
                location = "宜蘭縣";
                break;
            case "H":
                ary[0] = 17;
                location = "桃園市";
                break;
            case "I":
                ary[0] = 34;
                location = "嘉義市";
                break;
            case "J":
                ary[0] = 18;
                location = "新竹縣";
                break;
            case "K":
                ary[0] = 19;
                location = "苗栗縣";
                break;
            case "L":
                ary[0] = 20;
                location = "台中縣";
                break;
            case "M":
                ary[0] = 21;
                location = "南投縣";
                break;
            case "N":
                ary[0] = 22;
                location = "彰化縣";
                break;
            case "O":
                ary[0] = 35;
                location = "新竹市";
                break;
            case "P":
                ary[0] = 23;
                location = "雲林縣";
                break;
            case "Q":
                ary[0] = 24;
                location = "嘉義縣";
                break;
            case "R":
                ary[0] = 25;
                location = "臺南縣";
                break;
            case "S":
                ary[0] = 26;
                location = "高雄縣";
                break;
            case "T":
                ary[0] = 27;
                location = "屏東縣";
                break;
            case "U":
                ary[0] = 28;
                location = "花蓮縣";
                break;
            case "V":
                ary[0] = 29;
                location = "臺東縣";
                break;
            case "W":
                ary[0] = 32;
                location = "金門縣";
                break;
            case "X":
                ary[0] = 30;
                location = "澎湖縣";
                break;
            case "Y":
                ary[0] = 31;
                location = "陽明山管理局";
                break;
            case "Z":
                ary[0] = 33;
                location = "連江縣";
                break;
        }
        tensdigit = (ary[0] / 10);//英文字母換算數值後的十位數
        digit = (ary[0] % 10);//英文字母換算數值後的個位數
        firstletter = tensdigit + (digit * 9);//計算英文字母換算的總和
        //將剩餘數字進行加總
        for (int j = 1; j < 9; j++) {
            sum = sum + (ary[j] * (9 - j));
        }
        //select=0為驗證是否有效身分證，1的話為產生身分證
        switch (select) {
            case 0:
                sum = sum + firstletter + ary[9];
                //判斷加總後是否能被10整除
                if (sum % 10 == 0) {
                    greeting.yes(location, ary);
                } else {
                    greeting.no();
                }
            case 1:
                sum = sum + firstletter;
                if (sum % 10 == 0) {
                    ary[9] = 0;
                } else {
                    int x = 10 - (sum % 10);
                    ary[9] = x;
                }
        }
        return ary;
    }
}