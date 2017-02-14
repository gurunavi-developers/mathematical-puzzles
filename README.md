# Scalaもくもく会：数学パズル編
## テキスト
プログラマ脳を鍛える数学パズル シンプルで高速なコードが書けるようになる70問 
https://www.amazon.co.jp/dp/B016QEE30G/ref=dp-kindle-redirect?_encoding=UTF8&btkr=1

### 使用言語
- Scala
- その他好きな言語

## 開催日
- もくもく会：毎週木曜日の定時後
- 定例：定時内に月１

### 解く問題
- もくもく会：入門編、初級編
- 定例：中級編、上級編（予め解いてくる）

## 進め方
1. [gurunavi-developers/matehmatical-puzzles](https://github.com/gurunavi-developers/matehmatical-puzzles)をforkする
2. 各自でもくもくと解く。
3. [gurunavi-developers/matehmatical-puzzles](https://github.com/gurunavi-developers/matehmatical-puzzles)へのPRを作成する
4. 一番いいコードを[gurunavi-developers/matehmatical-puzzles](https://github.com/gurunavi-developers/matehmatical-puzzles)にmergeする

## リポジトリ
### ディレクトリ構成  
- 言語ごとにディレクトリを切る
- src以下に問題毎のディレクトリを作成する。  

```
.
├── README.md
├── Scala
│   └── src
│       ├── Q1
│       │   └── Main.scala
│       └── Q2
│           └── Main.scala
.
.
.
└── <言語名>
    └── src
        └── Q1
            └── foo.bar
```
