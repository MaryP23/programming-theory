import javax.swing.*;

// GameSessionManager.java
public class GameSessionManager {
    private static GameSessionManager instance;
    private int gamesPlayed;
    private int gamesWon;
    private long totalTime;
    private long startTime;

    private GameSessionManager() {
        gamesPlayed = 0;
        gamesWon = 0;
        totalTime = 0;
    }

    public static GameSessionManager getInstance() {
        if (instance == null) {
            instance = new GameSessionManager();
        }
        return instance;
    }

    public void gameStarted() {
        gamesPlayed++;
        startTime = System.currentTimeMillis();
    }

    public void gameWon() {
        gamesWon++;
        totalTime += System.currentTimeMillis() - startTime;
    }

    public void displayStatistics() {
        double winRate = gamesPlayed > 0 ? (gamesWon * 100.0 / gamesPlayed) : 0;
        long avgTime = gamesWon > 0 ? (totalTime / gamesWon / 1000) : 0;

        String stats = String.format(
                "Статистика игры:\n\n" +
                        "Сыграно игр: %d\n" +
                        "Выиграно игр: %d\n" +
                        "Процент побед: %.1f%%\n" +
                        "Среднее время победы: %d сек.",
                gamesPlayed, gamesWon, winRate, avgTime
        );

        JOptionPane.showMessageDialog(null, stats, "Статистика", JOptionPane.INFORMATION_MESSAGE);
    }

    public int getGamesPlayed() { return gamesPlayed; }
    public int getGamesWon() { return gamesWon; }
}
