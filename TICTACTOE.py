board = [' ' for _ in range(9)]

def print_board():
    row1 = '| {} | {} | {} |'.format(board[0], board[1], board[2])
    row2 = '| {} | {} | {} |'.format(board[3], board[4], board[5])
    row3 = '| {} | {} | {} |'.format(board[6], board[7], board[8])

    print(row1)
    print(row2)
    print(row3)

def check_win(player):
    win_conditions = [(0, 1, 2), (3, 4, 5), (6, 7, 8), 
                       (0, 3, 6), (1, 4, 7), (2, 5, 8), 
                       (0, 4, 8), (2, 4, 6)]
    for condition in win_conditions:
        if board[condition[0]] == player and board[condition[1]] == player and board[condition[2]] == player:
            return True
    return False

def is_full():
    return ' ' not in board

def main():
    current_player = 'X'
    while not is_full():
        print_board()
        move = input('Player {}: Where do you want to move? '.format(current_player))
        try:
            move = int(move)
            if board[move] == ' ':
                board[move] = current_player
                if check_win(current_player):
                    print_board()
                    print('Player {} wins!'.format(current_player))
                    break
                else:
                    if current_player == 'X':
                        current_player = 'O'
                    else:
                        current_player = 'X'
            else:
                print('Sorry, that space is already taken!')
        except:
            print('Sorry, that is not a valid move.')

if __name__ == '__main__':
    main()