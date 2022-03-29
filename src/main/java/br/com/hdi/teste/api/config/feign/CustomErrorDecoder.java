package br.com.hdi.teste.api.config.feign;

import br.com.hdi.teste.api.utility.exceptions.ApiResourceGeneric;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        switch (response.status()) {
            case 400:
                return new ApiResourceGeneric(response.request().url() + " error in request");
            case 404:
                return new ApiResourceGeneric(response.request().url() + " was not found");
            default:
                return new ApiResourceGeneric("Erro desconhecido");
        }
    }
}
