package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		
		String[] targetWords = {"apple", "banana", "grape", "orange"};

		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		for (String targetWord : targetWords) {
			if (dictionary.contains(targetWord)) {
				System.out.println(targetWord + "の意味は" + dictionary.getMeaning(targetWord));
			} else {
				System.out.println(targetWord + "は辞書に存在しません");
			}
		}
	}
}
