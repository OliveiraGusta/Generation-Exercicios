programa
{
    funcao inicio()
    {
        inteiro vetorOriginal[10], vetorOrdenado[10] 

        lerVetorUsuario(vetorOriginal)

        copiarVetor(vetorOriginal, vetorOrdenado)
        ordenarVetorDecrescente(vetorOrdenado)
        
        escreva("\nVetor Original:")
        exibirVetor(vetorOriginal)

        escreva("\nVetor em Ordem Decrescente:")
        exibirVetor(vetorOrdenado)
    }

    funcao lerVetorUsuario(inteiro v[])
    {
        para (inteiro i = 0; i < 10; i++)
        {
            escreva("Valor para posição ", i, ": ")
            leia(v[i])
        }
    }

    funcao copiarVetor(inteiro origem[], inteiro destino[])
    {
        para (inteiro i = 0; i < 10; i++)
        {
            destino[i] = origem[i]
        }
    }

    funcao ordenarVetorDecrescente(inteiro v[])
    {
        inteiro temp

        para (inteiro i = 0; i < 10; i++)
        {
            para (inteiro j = 0; j < 10 - i - 1; j++)
            {
                se (v[j] < v[j + 1])
                {
                    temp = v[j]
                    v[j] = v[j + 1]
                    v[j + 1] = temp
                }
            }
        }
    }

    funcao exibirVetor(inteiro v[])
    {
        escreva(" [")
        para (inteiro i = 0; i < 10; i++)
        {
            escreva(v[i])
            se (i < 9) escreva("]", "[")
        }
        escreva("]")
    }
}
