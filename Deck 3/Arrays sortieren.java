public class Task {
  public int[] sortArr(int[] unorderedArr){

    // Beispiele, wie das Array "unorderedArr" aussehen koennte:
    // [1, 10, 7, 8, 3, 9, 4, 11, 8, 3, 7, 2]
    // [11, 4, 7, 3, 7, 1, 9, 12, 8, 2, 1]
    //
    // Deine Loesung
    // Die Funktion sortArr soll das sortierte Array zurueckgeben
    for (int i = 0; i < unorderedArr.length; i++) {
      // Das letzte Element des Arrays ist schon sortiert und muss deshalb nicht
      // beachtet werden
			for (int j = 0; j < unorderedArr.length -1-i; j++) {
				if (unorderedArr[j+1] < unorderedArr[j]) {
					int temp = unorderedArr[j];
					unorderedArr[j] = unorderedArr[j+1];
					unorderedArr[j+1] = temp;
				}
			}
	  }
  }
}
