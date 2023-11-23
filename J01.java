class LCD {
    int a10 = 2000;
    int b15 = 2500;
    int c17 = 3000;
}

class CPU {
    int a166 = 6000;
    int b22 = 8000;
    int c24 = 11000;
}

class HD {
    int a120G = 2400;
    int b160G = 2800;
}

class MiniNote {
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost() {
        return (lcd.a10 + cpu.a166 + hd.a120G) * 14 / 10; // 1.4 times the cost
    }

    int calculatePrice() {
        return  (lcd.a10 + cpu.a166 + hd.a120G)* 2; // Twice the cost for pricing
    }
}

class Note15 {
    LCD lcd = new LCD();
    CPU cpu = new CPU();
    HD hd = new HD();

    int calculateCost() {
        return (lcd.b15 + cpu.b22 + hd.b160G) * 14 / 10; // 1.4 times the cost
    }

    int calculatePrice() {
        return (lcd.b15 + cpu.b22 + hd.b160G) * 2; // Twice the cost for pricing
    }
}
public class J01 {
    public static void main(String[] args) {
        MiniNote miniNote = new MiniNote();
        System.out.println("MiniNote Cost: " + miniNote.calculateCost() + ", Price: " + miniNote.calculatePrice());

        Note15 note15 = new Note15();
        System.out.println("Note15 Cost: " + note15.calculateCost()+ ", Price: " + note15.calculatePrice());
    }
}

//建立類別 LCD CPU HD //
//建立類別 MiniNote 宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//建立類別 Note15   宣告變數 lcd cpu hd 裡面的值從 LCD CPD HD 賦予的//
//計算呈成本呼叫用lcd cpu hd 裡的值 回傳到calculateCost裡//
//計算呈定價呼叫用lcd cpu hd 裡的值 回傳到calculatePrice裡//
//最後設一個新物件印出成本及定價//

