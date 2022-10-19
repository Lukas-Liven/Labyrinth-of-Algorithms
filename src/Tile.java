package Labyrinth;
public class Tile {
private int start = 0;
private int goal = 0;
private int obstacle = 0;
public void CreateWall() {
	obstacle = 1;
}
public void SetStart() {
	start = 1;
}
public void SetGoal() {
	goal = 1;
}
public int CheckStart() {
	return start;
}
public int CheckWall() {
	return obstacle;
}
public int CheckGoal() {
	return goal;
}
}
