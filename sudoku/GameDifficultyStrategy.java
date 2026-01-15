// GameDifficultyStrategy.java
public interface GameDifficultyStrategy {
    void applyDifficulty(SudokuBoard board);
}

// EasyDifficulty.java
class EasyDifficulty implements GameDifficultyStrategy {
    @Override
    public void applyDifficulty(SudokuBoard board) {
        board.generateNewPuzzle();
    }
}

// MediumDifficulty.java
class MediumDifficulty implements GameDifficultyStrategy {
    @Override
    public void applyDifficulty(SudokuBoard board) {
        board.generateNewPuzzle();
        // Для среднего уровня можно удалять больше чисел
    }
}

// HardDifficulty.java
class HardDifficulty implements GameDifficultyStrategy {
    @Override
    public void applyDifficulty(SudokuBoard board) {
        board.generateNewPuzzle();
        // Для сложного уровня можно удалять еще больше чисел
    }
}
