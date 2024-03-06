package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {
		char ch = 'a';
		for (int i = 0; i < pieces.length; i++) {
			for (int j = 0; j < pieces.length; j++) {
				if (j == 0) {
					System.out.print(pieces.length - i + " ");
				}
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.print("  ");
		for (int i = 0; i < pieces.length; i++) {
			System.out.print(ch + " ");
			ch++;
		}
	}

	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}

		System.out.print(" ");
	}
}
