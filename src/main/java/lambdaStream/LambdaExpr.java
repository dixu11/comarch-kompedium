package lambdaStream;

public class LambdaExpr {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int execute(int number1, int number2) {
                return number1 + number2;
            }
        };

        System.out.println(addition.execute(1, 2));

        MathOperation subtraction = (int number1, int number2) -> {
            return number1 - number2;
        };
        //pominięto zbędne fragmenty plus strzałka: () -> {}

        //można pominąc typy
        //jeśli implementacja zajmuje jedną linijkę możemy pominąc klamrę i return
        //jeśli 1 parametr metody można pominąć nawias
        MathOperation subtraction2 = ( number1,  number2) -> number1 - number2;
        useOperation(subtraction2);

        useOperation(( number1,  number2) -> number1 - number2);

    }

    public static void useOperation(MathOperation operation) {
        System.out.println("Testing:");
        System.out.println(operation.execute(1,2));
    }

}

@FunctionalInterface // opcjonalna adnotacja sprawdzająca
interface MathOperation {
    int execute(int number1, int number2);
}

//interfejs funkcyjny to interfejs z dokładnie jedną metodą abstrakcyjną
//  możemy go implementować za pomocą wyrażeń lambda
