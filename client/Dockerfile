FROM node:10-alpine
WORKDIR /client

COPY package* /client/

RUN npm install

COPY . /client/

EXPOSE 3000

CMD [ "npm", "run", "serve" ]
