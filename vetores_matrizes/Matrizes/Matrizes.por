programa
{
    funcao inicio()
    {
        inteiro vetor[10], soma = 0, contadorPares = 0 
        real media 
        
        para (inteiro i = 0; i < 10; i++)
        {
            escreva("Digite o ", i + 1, "° numero: ")
            leia(vetor[i])
            soma = soma + vetor[i]
            se (vetor[i] % 2 == 0) 
            {
                contadorPares = contadorPares + 1
            }
        }

        escreva("\nElementos nos índices ímpares:\n")
        para (inteiro i = 1; i < 10; i = i + 2)
        {
            escreva(vetor[i], " ")
        }

        escreva("\n\nElementos pares:\n")
        para (inteiro i = 0; i < 10; i++)
        {
            se (vetor[i] % 2 == 0)
            {
                escreva(vetor[i], " ")
            }
        }

        escreva("\n\nSoma:\n", soma)

        media = soma / 10.0
        escreva("\n\nMedia:\n", (media + 0.5)) 
    }
}
