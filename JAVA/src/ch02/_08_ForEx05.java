package ch02;

public class _08_ForEx05 {
	public static void main(String[] args) {

		String str = "no pain no gain"; // 문장에서 특정 글자 뽑아내기
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// str 문자열 중에서 'o'가 나오면 count를 증가시키고, 그렇지 않으면 증가를 스킵하고 다음 문자를 체크한다.
			if (str.charAt(i) != 'o')
				continue; // 반복문에서 조건이 만족하지 않으면 아래 문장을 스킵하고, 계속 반복한다.
		}
		count++;
		System.out.println("str의 길이 :" + str.length());
		System.out.println("문장에서 발견된 o의 갯수:" + count);

	}

}
