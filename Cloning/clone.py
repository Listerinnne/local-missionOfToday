import os 
import sys

class Clone:
    def ing(self):
        print('work?')
        sys.stdin = open ('input.txt', 'r', encoding='UTF-8')

        # input.txt  format
        '''
        github user.name        edujihye21
        github user.email       edujihye21@gmail.com
        클론 해올 레포의 수        3
        클론 해올 레포의 이름      TIL  
                                edujihye21.github.io
                                edujihye21
        '''


        name = input()
        email = input()
        print(f'user.name: {name}\nuser.email: {email}')
        os.system(f'git config --global user.name {name}')
        os.system(f'git config --global user.email {email}')

        # check
        os.system(f'git config --global user.name')
        os.system(f'git config --global user.email')


        cnt = int(input())

        repoes = [str(input()) for _ in range(cnt)]

        for repo in repoes:
            os.system(f'git clone https://github.com/{name}/{repo}.git')
            print('='*50)
