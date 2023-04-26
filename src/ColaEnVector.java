
public class ColaEnVector {
    private int [] vColas;
    private int maximo, primero, ultimo,x;
    public ColaEnVector(int pCanReser)
    {
        maximo=pCanReser;
        vColas=new int[maximo];
        primero=x=0;
        ultimo=-1;
    }
    public boolean colaVacia()
    {
        boolean vacia=false;
        if (primero>ultimo)
        {
            ultimo=-1;
            primero=x=0;
            vacia=true;
        }
        return vacia;

    }
    public void encolar(int pDato)
    {
        ++ultimo;
        vColas[ultimo]=pDato;
    }
    public int desencolar()
    {
        int datoDesencolado;
        datoDesencolado=vColas[primero];
        ++primero;
        x=primero;
        return datoDesencolado;
    }
    public int mostrarCola()
    {
        if(x<=ultimo)
        {
            return vColas[x++];

        }else
        {
            x=primero;
            return -1;
        }
    }
    public boolean colaLlena()
    {
        int p,k;
        if(primero==0&& ultimo==(maximo-1))
        {
            return true;
        }
        else
        {
            if(ultimo==(maximo-1))
            {
                k=0;
                for(p=primero; p<=ultimo; p++)
                {
                    vColas[k]=vColas[p];
                    ++k;
                }
                ultimo=maximo-1-primero;
                primero=0;
                x=0;
            }
            return false;
        }

    }
    }
