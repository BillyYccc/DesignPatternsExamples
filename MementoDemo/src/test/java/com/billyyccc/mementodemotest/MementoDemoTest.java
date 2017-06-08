/*
 * MIT License
 *
 * Copyright (c) 2017 BillyYuan
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.billyyccc.mementodemotest;

import com.billyyccc.mementodemo.ChessGame;
import com.billyyccc.mementodemo.ChessGameCaretaker;
import org.junit.Test;

/**
 * Created by Billy Yuan on 2017/6/7.
 * Email: billy112487983@gmail.com
 */

public class MementoDemoTest {
    @Test
    public void mementoDemoTest() throws CloneNotSupportedException {
        //新开一局比赛
        ChessGame chessGame = new ChessGame();

        //创建Caretaker保存棋局
        ChessGameCaretaker chessGameCaretaker = new ChessGameCaretaker();

        //显示当前比赛棋局
        chessGame.showGameDetails();

        System.out.println("-----开始比赛----");

        System.out.println("-----系统自动保存-----");
        chessGameCaretaker.addMemento(0, chessGame.saveGame());
        System.out.println("-----系统保存完毕-----");
        chessGame.showGameDetails();

        //白棋走第一步
        System.out.println("白棋先走第一步...");
        chessGame.getChessBoard().setColumnOfWhiteKing('f');
        chessGame.getChessBoard().setRowOfWhiteKing(2);
        System.out.println("白棋走完了...");
        System.out.println("-----系统自动保存-----");
        chessGameCaretaker.addMemento(1, chessGame.saveGame());
        System.out.println("-----系统保存完毕-----");
        chessGame.showGameDetails();


        //黑棋走第二步
        System.out.println("黑棋走第二步...");
        chessGame.getChessBoard().setColumnOfBlackKing('d');
        chessGame.getChessBoard().setRowOfBlackKing(7);
        System.out.println("黑棋走完了...");
        System.out.println("-----系统自动保存-----");
        chessGameCaretaker.addMemento(2, chessGame.saveGame());
        System.out.println("-----系统保存完毕-----");
        chessGame.showGameDetails();


        //白棋走第三步
        System.out.println("白棋走第三步...");
        chessGame.getChessBoard().setColumnOfWhiteKing('f');
        chessGame.getChessBoard().setRowOfWhiteKing(3);
        System.out.println("白棋走完了...");
        System.out.println("-----系统自动保存-----");
        chessGameCaretaker.addMemento(3, chessGame.saveGame());
        System.out.println("-----系统保存完毕-----");
        chessGame.showGameDetails();

        //黑棋悔棋，回到第二步
        System.out.println("-----黑棋要悔棋-----");
        chessGame.restoreGame(chessGameCaretaker.getMemento(2));
        System.out.println("-----黑棋悔棋成功-----");
        chessGame.showGameDetails();
    }
}
