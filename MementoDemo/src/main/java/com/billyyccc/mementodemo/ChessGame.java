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

package com.billyyccc.mementodemo;

/**
 * Created by Billy Yuan on 2017/6/7.
 * Email: billy112487983@gmail.com
 */

/* Chess Game, Originator in pattern */
public class ChessGame {
    private ChessBoard chessBoard;

    public ChessGame() {
        //初始化棋盘
        this.chessBoard = new ChessBoard();
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    //保存比赛
    public ChessGameMemento saveGame() {
        return new ChessGameMemento(this.chessBoard);
    }

    //恢复比赛
    public void restoreGame(ChessGameMemento chessGameMemento) {
        this.chessBoard = chessGameMemento.getChessBoard();
    }

    //显示棋局
    public void showGameDetails() {
        this.getChessBoard().showLayout();
    }
}
