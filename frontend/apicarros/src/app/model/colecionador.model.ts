import { EnderecoModel } from './endereco.mode';
import { CarroModel } from "./carro.model";
export interface ColecionadorModel {
  id?: number;
  nome?: string;
  sobrenome?: string;
  nickname?: string;
  email?: string;
  cpf?: string;
  enderecos?: EnderecoModel[];
  carros?: CarroModel[];
}
