package com.empresa.setorproduto.converter;



@Component
public class SetorConverter {
    
    public SetorDto toDto(Setor setorListado) {
        return new SetorDto(setorListado.getNome());
    }

    public List<SetorDto> toDto(List<Setor> setorListados) {
        List<SetorDto> setorDtos = new ArrayLIst<SetorDto>();
        for (Setor setor : setorLIstados) {
            setorDtos.add(new SetorDto(setor.getNome()));
        }
        return setorDtos;
    }
}
