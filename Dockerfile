
# Use a base image oficial do OpenJDK
FROM gradle:jdk17-jammy

# Diretório de trabalho no contêiner
WORKDIR /app

# o Cop diretieório do projeto para o contêiner
COPY UnifyEventos /app/UnifyEventos

# Exponha a porta que a aplicação Spring Boot utiliza
EXPOSE 8081

# Comando para executar a aplicação Spring Boot com o hot reload
# Use the gradle command to build and run the application
CMD cd /app/UnifyEventos && ./gradle bootRun
