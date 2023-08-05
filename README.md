# Algorithm

BACKJOON 백준 단계별로 풀어보기 입니다 ( https://www.acmicpc.net/ )

단계 = 패키지 level / 단계별 문제 = 클래스 step 으로 구분했습니다

답안 제출 할 때 class 명이 Main 이어야 하며 import 내용도 같이 추가 해줘야 합니다

```
변경) 단계별 문제 위치와 순서 변경으로 인하여 level21 이후부터 패키지와 클래스 저장 방식을 변경했습니다

이전 단계별 기준 level 21까지는 before 패키지에 모으고 이후는 after 패키지에서 시작하겠습니다

클래스명은 N + 문제번호 이며 패키지에 10문제씩 넣겠습니다
```

예시 )
````

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 정답

    }
}

````