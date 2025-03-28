# Calculadora de IMC - Android

## 📌 Informações do Aluno
- **Nome:** Lucas Oliveira da Silva
- **Curso:** Ciência da Computação
- **Instituição:** FECAP
- **Matrícula:** 24025988

## 🔍 Descrição do Projeto
Aplicativo Android para cálculo de Índice de Massa Corporal (IMC) com:
- Cálculo automático
- Classificação em categorias
- Feedback visual personalizado
- Interface seguindo padrões Material Design

## 🛠 Tecnologias Utilizadas
- Android Studio
- Java
- XML
- GitHub

## 📦 Estrutura do Projeto
```
.
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/       # Códigos-fonte
│   │   │   ├── res/        # Recursos (imagens, layouts)
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
├── gradle/
└── build.gradle
```

## 🚀 Processo de Desenvolvimento
### Desafios Encontrados
1. Implementação das múltiplas Activities
2. Passagem de dados entre telas
3. Tratamento de inputs inválidos

### Soluções Implementadas
- Uso de `Intent` e `Bundle` para comunicação
- Validação de campos com `TextWatcher`
- Padronização de cores via `colors.xml`
