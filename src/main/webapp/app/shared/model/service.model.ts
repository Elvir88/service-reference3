export interface IService {
  id?: number;
  serviceId?: string;
  title?: string;
  service?: IService | null;
}

export class Service implements IService {
  constructor(public id?: number, public serviceId?: string, public title?: string, public service?: IService | null) {}
}
