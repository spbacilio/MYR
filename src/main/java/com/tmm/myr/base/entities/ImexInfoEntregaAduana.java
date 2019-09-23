/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmm.myr.base.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bacil
 */
@Entity
@Table(name = "Imex_Info_EntregaAduana")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ImexInfoEntregaAduana.findAll", query = "SELECT i FROM ImexInfoEntregaAduana i")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByInfoEntregaId", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.infoEntregaId = :infoEntregaId")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEntregaId", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.entregaId = :entregaId")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByTranTypeId", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.tranTypeId = :tranTypeId")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByImpoExpo", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.impoExpo = :impoExpo")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEntry", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.entry = :entry")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByGuia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.guia = :guia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByLiberoAduana", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.liberoAduana = :liberoAduana")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaLiberado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaLiberado = :fechaLiberado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findBySalioTren", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.salioTren = :salioTren")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findBySalioPuerta", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.salioPuerta = :salioPuerta")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUltimoModificado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.ultimoModificado = :ultimoModificado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDocEntrega", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.docEntrega = :docEntrega")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByBl", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.bl = :bl")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByRegimen", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.regimen = :regimen")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPedimento", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.pedimento = :pedimento")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDescripcionMercancia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.descripcionMercancia = :descripcionMercancia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByValorComercial", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.valorComercial = :valorComercial")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPesoMercancia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.pesoMercancia = :pesoMercancia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUm", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.um = :um")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByBultos", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.bultos = :bultos")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUMBultos", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.uMBultos = :uMBultos")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaEntregaTransito", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaEntregaTransito = :fechaEntregaTransito")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByNumeroPatenteAA", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.numeroPatenteAA = :numeroPatenteAA")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByClavePedimento", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.clavePedimento = :clavePedimento")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaCierreTransito", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaCierreTransito = :fechaCierreTransito")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPrimerPuertoEmbarque", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.primerPuertoEmbarque = :primerPuertoEmbarque")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByProveedorMercancia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.proveedorMercancia = :proveedorMercancia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDireccionProveedor", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.direccionProveedor = :direccionProveedor")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByENTRYNumber", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.eNTRYNumber = :eNTRYNumber")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByNIUNumber", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.nIUNumber = :nIUNumber")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findBySellos", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.sellos = :sellos")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByOrigen", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.origen = :origen")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDestino", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.destino = :destino")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByRampaOrigen", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.rampaOrigen = :rampaOrigen")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEscapeOrigen", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.escapeOrigen = :escapeOrigen")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByRampaDestino", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.rampaDestino = :rampaDestino")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEscapeDestino", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.escapeDestino = :escapeDestino")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByRutaFerroviaria", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.rutaFerroviaria = :rutaFerroviaria")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPuntoIntercambio", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.puntoIntercambio = :puntoIntercambio")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findBySeleccion", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.seleccion = :seleccion")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByNumeroFactura", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.numeroFactura = :numeroFactura")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaRetorno", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaRetorno = :fechaRetorno")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDestinoRetorno", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.destinoRetorno = :destinoRetorno")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaConfiscado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaConfiscado = :fechaConfiscado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDesconsolidado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.desconsolidado = :desconsolidado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByConsolidado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.consolidado = :consolidado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByLlenoVacio", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.llenoVacio = :llenoVacio")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPeso", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.peso = :peso")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPiezas", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.piezas = :piezas")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUnidad", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.unidad = :unidad")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findBySellosSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.sellosSalida = :sellosSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEstatusAduanal", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.estatusAduanal = :estatusAduanal")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPlataformaSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.plataformaSalida = :plataformaSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByReferenciaCliente", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.referenciaCliente = :referenciaCliente")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByComentariosPedimento", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.comentariosPedimento = :comentariosPedimento")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPosicion", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.posicion = :posicion")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUMPeso", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.uMPeso = :uMPeso")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaAvisoAbandono", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaAvisoAbandono = :fechaAvisoAbandono")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByObservacionActaEntrega", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.observacionActaEntrega = :observacionActaEntrega")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByInfRelMcia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.infRelMcia = :infRelMcia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByComentariosPlanCarga", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.comentariosPlanCarga = :comentariosPlanCarga")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByConsignatario", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.consignatario = :consignatario")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByTipoContenedor", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.tipoContenedor = :tipoContenedor")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaIngreso", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaIngreso = :fechaIngreso")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaManiobra", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaManiobra = :fechaManiobra")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaSalida = :fechaSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEstadia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.estadia = :estadia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByAlmacenaje", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.almacenaje = :almacenaje")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEmpresaTransferencia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.empresaTransferencia = :empresaTransferencia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaTransferencia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaTransferencia = :fechaTransferencia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByPedimentoSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.pedimentoSalida = :pedimentoSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByNumeroPatenteSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.numeroPatenteSalida = :numeroPatenteSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByClavePedimentoSalida", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.clavePedimentoSalida = :clavePedimentoSalida")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaEscritura", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaEscritura = :fechaEscritura")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByTerminalId", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.terminalId = :terminalId")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByDomicilioConsignatario", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.domicilioConsignatario = :domicilioConsignatario")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByTipoManiobra", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.tipoManiobra = :tipoManiobra")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByClaseManiobra", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.claseManiobra = :claseManiobra")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFacturatario", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.facturatario = :facturatario")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByEdiGenerado", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.ediGenerado = :ediGenerado")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByAgenteAduanal", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.agenteAduanal = :agenteAduanal")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaDestinoRetorno", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaDestinoRetorno = :fechaDestinoRetorno")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaAbandono", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaAbandono = :fechaAbandono")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaManiobraAnden", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaManiobraAnden = :fechaManiobraAnden")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFolioCFDI", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.folioCFDI = :folioCFDI")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByMontoCFDI", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.montoCFDI = :montoCFDI")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByMontoAlmacenaje", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.montoAlmacenaje = :montoAlmacenaje")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByCompensacionAlmacenaje", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.compensacionAlmacenaje = :compensacionAlmacenaje")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByMciaAsignadoAduana", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.mciaAsignadoAduana = :mciaAsignadoAduana")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByOficioAduana", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.oficioAduana = :oficioAduana")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByOficioAduanaFisco", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.oficioAduanaFisco = :oficioAduanaFisco")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByAlmacenajeASolicitud", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.almacenajeASolicitud = :almacenajeASolicitud")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByVolumenMercancia", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.volumenMercancia = :volumenMercancia")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByIdCatPuertoAduana", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.idCatPuertoAduana = :idCatPuertoAduana")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUserName", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.userName = :userName")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUserNameHR", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.userNameHR = :userNameHR")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaHR", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaHR = :fechaHR")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByHr", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.hr = :hr")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByUserNameCT", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.userNameCT = :userNameCT")
    , @NamedQuery(name = "ImexInfoEntregaAduana.findByFechaCT", query = "SELECT i FROM ImexInfoEntregaAduana i WHERE i.fechaCT = :fechaCT")})
public class ImexInfoEntregaAduana implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "InfoEntregaId")
    private Integer infoEntregaId;
    @Column(name = "EntregaId")
    private Integer entregaId;
    @Column(name = "TranTypeId")
    private Integer tranTypeId;
    @Column(name = "ImpoExpo")
    private String impoExpo;
    @Column(name = "Entry")
    private String entry;
    @Column(name = "Guia")
    private String guia;
    @Column(name = "LiberoAduana")
    private String liberoAduana;
    @Column(name = "FechaLiberado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaLiberado;
    @Column(name = "SalioTren")
    private String salioTren;
    @Column(name = "SalioPuerta")
    private String salioPuerta;
    @Column(name = "UltimoModificado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimoModificado;
    @Column(name = "DocEntrega")
    private String docEntrega;
    @Column(name = "BL")
    private String bl;
    @Column(name = "Regimen")
    private String regimen;
    @Column(name = "Pedimento")
    private String pedimento;
    @Column(name = "DescripcionMercancia")
    private String descripcionMercancia;
    @Column(name = "ValorComercial")
    private String valorComercial;
    @Column(name = "PesoMercancia")
    private String pesoMercancia;
    @Column(name = "UM")
    private String um;
    @Column(name = "Bultos")
    private String bultos;
    @Column(name = "UM_Bultos")
    private String uMBultos;
    @Column(name = "FechaEntregaTransito")
    private String fechaEntregaTransito;
    @Column(name = "NumeroPatenteAA")
    private String numeroPatenteAA;
    @Column(name = "ClavePedimento")
    private String clavePedimento;
    @Column(name = "FechaCierreTransito")
    private String fechaCierreTransito;
    @Column(name = "PrimerPuertoEmbarque")
    private String primerPuertoEmbarque;
    @Column(name = "ProveedorMercancia")
    private String proveedorMercancia;
    @Column(name = "DireccionProveedor")
    private String direccionProveedor;
    @Column(name = "ENTRYNumber")
    private String eNTRYNumber;
    @Column(name = "NIUNumber")
    private String nIUNumber;
    @Column(name = "Sellos")
    private String sellos;
    @Column(name = "Origen")
    private String origen;
    @Column(name = "Destino")
    private String destino;
    @Column(name = "RampaOrigen")
    private String rampaOrigen;
    @Column(name = "EscapeOrigen")
    private String escapeOrigen;
    @Column(name = "RampaDestino")
    private String rampaDestino;
    @Column(name = "EscapeDestino")
    private String escapeDestino;
    @Column(name = "RutaFerroviaria")
    private String rutaFerroviaria;
    @Column(name = "PuntoIntercambio")
    private String puntoIntercambio;
    @Column(name = "Seleccion")
    private String seleccion;
    @Column(name = "NumeroFactura")
    private String numeroFactura;
    @Column(name = "FechaRetorno")
    private String fechaRetorno;
    @Column(name = "DestinoRetorno")
    private String destinoRetorno;
    @Column(name = "FechaConfiscado")
    private String fechaConfiscado;
    @Column(name = "Desconsolidado")
    private String desconsolidado;
    @Column(name = "Consolidado")
    private String consolidado;
    @Column(name = "LlenoVacio")
    private String llenoVacio;
    @Column(name = "Peso")
    private String peso;
    @Column(name = "Piezas")
    private String piezas;
    @Column(name = "Unidad")
    private String unidad;
    @Column(name = "SellosSalida")
    private String sellosSalida;
    @Column(name = "EstatusAduanal")
    private String estatusAduanal;
    @Column(name = "PlataformaSalida")
    private String plataformaSalida;
    @Column(name = "ReferenciaCliente")
    private String referenciaCliente;
    @Column(name = "ComentariosPedimento")
    private String comentariosPedimento;
    @Column(name = "Posicion")
    private String posicion;
    @Column(name = "UMPeso")
    private String uMPeso;
    @Column(name = "FechaAvisoAbandono")
    private String fechaAvisoAbandono;
    @Column(name = "ObservacionActaEntrega")
    private String observacionActaEntrega;
    @Column(name = "InfRelMcia")
    private String infRelMcia;
    @Column(name = "ComentariosPlanCarga")
    private String comentariosPlanCarga;
    @Column(name = "Consignatario")
    private String consignatario;
    @Column(name = "TipoContenedor")
    private String tipoContenedor;
    @Column(name = "FechaIngreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaIngreso;
    @Column(name = "FechaManiobra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaManiobra;
    @Column(name = "FechaSalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaSalida;
    @Column(name = "Estadia")
    private Integer estadia;
    @Column(name = "Almacenaje")
    private Integer almacenaje;
    @Column(name = "EmpresaTransferencia")
    private String empresaTransferencia;
    @Column(name = "FechaTransferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTransferencia;
    @Column(name = "PedimentoSalida")
    private String pedimentoSalida;
    @Column(name = "NumeroPatenteSalida")
    private String numeroPatenteSalida;
    @Column(name = "ClavePedimentoSalida")
    private String clavePedimentoSalida;
    @Column(name = "FechaEscritura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEscritura;
    @Column(name = "TerminalId")
    private Integer terminalId;
    @Column(name = "DomicilioConsignatario")
    private String domicilioConsignatario;
    @Column(name = "TipoManiobra")
    private String tipoManiobra;
    @Column(name = "ClaseManiobra")
    private String claseManiobra;
    @Column(name = "Facturatario")
    private String facturatario;
    @Column(name = "EdiGenerado")
    private Boolean ediGenerado;
    @Column(name = "AgenteAduanal")
    private String agenteAduanal;
    @Column(name = "FechaDestinoRetorno")
    private String fechaDestinoRetorno;
    @Column(name = "FechaAbandono")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAbandono;
    @Column(name = "FechaManiobraAnden")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaManiobraAnden;
    @Column(name = "FolioCFDI")
    private String folioCFDI;
    @Column(name = "MontoCFDI")
    private String montoCFDI;
    @Column(name = "MontoAlmacenaje")
    private String montoAlmacenaje;
    @Column(name = "CompensacionAlmacenaje")
    private String compensacionAlmacenaje;
    @Column(name = "MciaAsignadoAduana")
    private String mciaAsignadoAduana;
    @Column(name = "OficioAduana")
    private String oficioAduana;
    @Column(name = "OficioAduanaFisco")
    private String oficioAduanaFisco;
    @Column(name = "AlmacenajeASolicitud")
    private String almacenajeASolicitud;
    @Column(name = "VolumenMercancia")
    private String volumenMercancia;
    @Column(name = "IdCatPuertoAduana")
    private Integer idCatPuertoAduana;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "UserNameHR")
    private String userNameHR;
    @Column(name = "FechaHR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHR;
    @Column(name = "HR")
    private Boolean hr;
    @Column(name = "UserNameCT")
    private String userNameCT;
    @Column(name = "FechaCT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCT;
    @JoinColumn(name = "ContainerId", referencedColumnName = "ContainerId")
    @ManyToOne
    private ImexContainer containerId;

    public ImexInfoEntregaAduana() {
    }

    public ImexInfoEntregaAduana(Integer infoEntregaId) {
        this.infoEntregaId = infoEntregaId;
    }

    public Integer getInfoEntregaId() {
        return infoEntregaId;
    }

    public void setInfoEntregaId(Integer infoEntregaId) {
        this.infoEntregaId = infoEntregaId;
    }

    public Integer getEntregaId() {
        return entregaId;
    }

    public void setEntregaId(Integer entregaId) {
        this.entregaId = entregaId;
    }

    public Integer getTranTypeId() {
        return tranTypeId;
    }

    public void setTranTypeId(Integer tranTypeId) {
        this.tranTypeId = tranTypeId;
    }

    public String getImpoExpo() {
        return impoExpo;
    }

    public void setImpoExpo(String impoExpo) {
        this.impoExpo = impoExpo;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getLiberoAduana() {
        return liberoAduana;
    }

    public void setLiberoAduana(String liberoAduana) {
        this.liberoAduana = liberoAduana;
    }

    public Date getFechaLiberado() {
        return fechaLiberado;
    }

    public void setFechaLiberado(Date fechaLiberado) {
        this.fechaLiberado = fechaLiberado;
    }

    public String getSalioTren() {
        return salioTren;
    }

    public void setSalioTren(String salioTren) {
        this.salioTren = salioTren;
    }

    public String getSalioPuerta() {
        return salioPuerta;
    }

    public void setSalioPuerta(String salioPuerta) {
        this.salioPuerta = salioPuerta;
    }

    public Date getUltimoModificado() {
        return ultimoModificado;
    }

    public void setUltimoModificado(Date ultimoModificado) {
        this.ultimoModificado = ultimoModificado;
    }

    public String getDocEntrega() {
        return docEntrega;
    }

    public void setDocEntrega(String docEntrega) {
        this.docEntrega = docEntrega;
    }

    public String getBl() {
        return bl;
    }

    public void setBl(String bl) {
        this.bl = bl;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getPedimento() {
        return pedimento;
    }

    public void setPedimento(String pedimento) {
        this.pedimento = pedimento;
    }

    public String getDescripcionMercancia() {
        return descripcionMercancia;
    }

    public void setDescripcionMercancia(String descripcionMercancia) {
        this.descripcionMercancia = descripcionMercancia;
    }

    public String getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(String valorComercial) {
        this.valorComercial = valorComercial;
    }

    public String getPesoMercancia() {
        return pesoMercancia;
    }

    public void setPesoMercancia(String pesoMercancia) {
        this.pesoMercancia = pesoMercancia;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getBultos() {
        return bultos;
    }

    public void setBultos(String bultos) {
        this.bultos = bultos;
    }

    public String getUMBultos() {
        return uMBultos;
    }

    public void setUMBultos(String uMBultos) {
        this.uMBultos = uMBultos;
    }

    public String getFechaEntregaTransito() {
        return fechaEntregaTransito;
    }

    public void setFechaEntregaTransito(String fechaEntregaTransito) {
        this.fechaEntregaTransito = fechaEntregaTransito;
    }

    public String getNumeroPatenteAA() {
        return numeroPatenteAA;
    }

    public void setNumeroPatenteAA(String numeroPatenteAA) {
        this.numeroPatenteAA = numeroPatenteAA;
    }

    public String getClavePedimento() {
        return clavePedimento;
    }

    public void setClavePedimento(String clavePedimento) {
        this.clavePedimento = clavePedimento;
    }

    public String getFechaCierreTransito() {
        return fechaCierreTransito;
    }

    public void setFechaCierreTransito(String fechaCierreTransito) {
        this.fechaCierreTransito = fechaCierreTransito;
    }

    public String getPrimerPuertoEmbarque() {
        return primerPuertoEmbarque;
    }

    public void setPrimerPuertoEmbarque(String primerPuertoEmbarque) {
        this.primerPuertoEmbarque = primerPuertoEmbarque;
    }

    public String getProveedorMercancia() {
        return proveedorMercancia;
    }

    public void setProveedorMercancia(String proveedorMercancia) {
        this.proveedorMercancia = proveedorMercancia;
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    public String getENTRYNumber() {
        return eNTRYNumber;
    }

    public void setENTRYNumber(String eNTRYNumber) {
        this.eNTRYNumber = eNTRYNumber;
    }

    public String getNIUNumber() {
        return nIUNumber;
    }

    public void setNIUNumber(String nIUNumber) {
        this.nIUNumber = nIUNumber;
    }

    public String getSellos() {
        return sellos;
    }

    public void setSellos(String sellos) {
        this.sellos = sellos;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getRampaOrigen() {
        return rampaOrigen;
    }

    public void setRampaOrigen(String rampaOrigen) {
        this.rampaOrigen = rampaOrigen;
    }

    public String getEscapeOrigen() {
        return escapeOrigen;
    }

    public void setEscapeOrigen(String escapeOrigen) {
        this.escapeOrigen = escapeOrigen;
    }

    public String getRampaDestino() {
        return rampaDestino;
    }

    public void setRampaDestino(String rampaDestino) {
        this.rampaDestino = rampaDestino;
    }

    public String getEscapeDestino() {
        return escapeDestino;
    }

    public void setEscapeDestino(String escapeDestino) {
        this.escapeDestino = escapeDestino;
    }

    public String getRutaFerroviaria() {
        return rutaFerroviaria;
    }

    public void setRutaFerroviaria(String rutaFerroviaria) {
        this.rutaFerroviaria = rutaFerroviaria;
    }

    public String getPuntoIntercambio() {
        return puntoIntercambio;
    }

    public void setPuntoIntercambio(String puntoIntercambio) {
        this.puntoIntercambio = puntoIntercambio;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(String fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getDestinoRetorno() {
        return destinoRetorno;
    }

    public void setDestinoRetorno(String destinoRetorno) {
        this.destinoRetorno = destinoRetorno;
    }

    public String getFechaConfiscado() {
        return fechaConfiscado;
    }

    public void setFechaConfiscado(String fechaConfiscado) {
        this.fechaConfiscado = fechaConfiscado;
    }

    public String getDesconsolidado() {
        return desconsolidado;
    }

    public void setDesconsolidado(String desconsolidado) {
        this.desconsolidado = desconsolidado;
    }

    public String getConsolidado() {
        return consolidado;
    }

    public void setConsolidado(String consolidado) {
        this.consolidado = consolidado;
    }

    public String getLlenoVacio() {
        return llenoVacio;
    }

    public void setLlenoVacio(String llenoVacio) {
        this.llenoVacio = llenoVacio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPiezas() {
        return piezas;
    }

    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getSellosSalida() {
        return sellosSalida;
    }

    public void setSellosSalida(String sellosSalida) {
        this.sellosSalida = sellosSalida;
    }

    public String getEstatusAduanal() {
        return estatusAduanal;
    }

    public void setEstatusAduanal(String estatusAduanal) {
        this.estatusAduanal = estatusAduanal;
    }

    public String getPlataformaSalida() {
        return plataformaSalida;
    }

    public void setPlataformaSalida(String plataformaSalida) {
        this.plataformaSalida = plataformaSalida;
    }

    public String getReferenciaCliente() {
        return referenciaCliente;
    }

    public void setReferenciaCliente(String referenciaCliente) {
        this.referenciaCliente = referenciaCliente;
    }

    public String getComentariosPedimento() {
        return comentariosPedimento;
    }

    public void setComentariosPedimento(String comentariosPedimento) {
        this.comentariosPedimento = comentariosPedimento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getUMPeso() {
        return uMPeso;
    }

    public void setUMPeso(String uMPeso) {
        this.uMPeso = uMPeso;
    }

    public String getFechaAvisoAbandono() {
        return fechaAvisoAbandono;
    }

    public void setFechaAvisoAbandono(String fechaAvisoAbandono) {
        this.fechaAvisoAbandono = fechaAvisoAbandono;
    }

    public String getObservacionActaEntrega() {
        return observacionActaEntrega;
    }

    public void setObservacionActaEntrega(String observacionActaEntrega) {
        this.observacionActaEntrega = observacionActaEntrega;
    }

    public String getInfRelMcia() {
        return infRelMcia;
    }

    public void setInfRelMcia(String infRelMcia) {
        this.infRelMcia = infRelMcia;
    }

    public String getComentariosPlanCarga() {
        return comentariosPlanCarga;
    }

    public void setComentariosPlanCarga(String comentariosPlanCarga) {
        this.comentariosPlanCarga = comentariosPlanCarga;
    }

    public String getConsignatario() {
        return consignatario;
    }

    public void setConsignatario(String consignatario) {
        this.consignatario = consignatario;
    }

    public String getTipoContenedor() {
        return tipoContenedor;
    }

    public void setTipoContenedor(String tipoContenedor) {
        this.tipoContenedor = tipoContenedor;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaManiobra() {
        return fechaManiobra;
    }

    public void setFechaManiobra(Date fechaManiobra) {
        this.fechaManiobra = fechaManiobra;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getEstadia() {
        return estadia;
    }

    public void setEstadia(Integer estadia) {
        this.estadia = estadia;
    }

    public Integer getAlmacenaje() {
        return almacenaje;
    }

    public void setAlmacenaje(Integer almacenaje) {
        this.almacenaje = almacenaje;
    }

    public String getEmpresaTransferencia() {
        return empresaTransferencia;
    }

    public void setEmpresaTransferencia(String empresaTransferencia) {
        this.empresaTransferencia = empresaTransferencia;
    }

    public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

    public String getPedimentoSalida() {
        return pedimentoSalida;
    }

    public void setPedimentoSalida(String pedimentoSalida) {
        this.pedimentoSalida = pedimentoSalida;
    }

    public String getNumeroPatenteSalida() {
        return numeroPatenteSalida;
    }

    public void setNumeroPatenteSalida(String numeroPatenteSalida) {
        this.numeroPatenteSalida = numeroPatenteSalida;
    }

    public String getClavePedimentoSalida() {
        return clavePedimentoSalida;
    }

    public void setClavePedimentoSalida(String clavePedimentoSalida) {
        this.clavePedimentoSalida = clavePedimentoSalida;
    }

    public Date getFechaEscritura() {
        return fechaEscritura;
    }

    public void setFechaEscritura(Date fechaEscritura) {
        this.fechaEscritura = fechaEscritura;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public String getDomicilioConsignatario() {
        return domicilioConsignatario;
    }

    public void setDomicilioConsignatario(String domicilioConsignatario) {
        this.domicilioConsignatario = domicilioConsignatario;
    }

    public String getTipoManiobra() {
        return tipoManiobra;
    }

    public void setTipoManiobra(String tipoManiobra) {
        this.tipoManiobra = tipoManiobra;
    }

    public String getClaseManiobra() {
        return claseManiobra;
    }

    public void setClaseManiobra(String claseManiobra) {
        this.claseManiobra = claseManiobra;
    }

    public String getFacturatario() {
        return facturatario;
    }

    public void setFacturatario(String facturatario) {
        this.facturatario = facturatario;
    }

    public Boolean getEdiGenerado() {
        return ediGenerado;
    }

    public void setEdiGenerado(Boolean ediGenerado) {
        this.ediGenerado = ediGenerado;
    }

    public String getAgenteAduanal() {
        return agenteAduanal;
    }

    public void setAgenteAduanal(String agenteAduanal) {
        this.agenteAduanal = agenteAduanal;
    }

    public String getFechaDestinoRetorno() {
        return fechaDestinoRetorno;
    }

    public void setFechaDestinoRetorno(String fechaDestinoRetorno) {
        this.fechaDestinoRetorno = fechaDestinoRetorno;
    }

    public Date getFechaAbandono() {
        return fechaAbandono;
    }

    public void setFechaAbandono(Date fechaAbandono) {
        this.fechaAbandono = fechaAbandono;
    }

    public Date getFechaManiobraAnden() {
        return fechaManiobraAnden;
    }

    public void setFechaManiobraAnden(Date fechaManiobraAnden) {
        this.fechaManiobraAnden = fechaManiobraAnden;
    }

    public String getFolioCFDI() {
        return folioCFDI;
    }

    public void setFolioCFDI(String folioCFDI) {
        this.folioCFDI = folioCFDI;
    }

    public String getMontoCFDI() {
        return montoCFDI;
    }

    public void setMontoCFDI(String montoCFDI) {
        this.montoCFDI = montoCFDI;
    }

    public String getMontoAlmacenaje() {
        return montoAlmacenaje;
    }

    public void setMontoAlmacenaje(String montoAlmacenaje) {
        this.montoAlmacenaje = montoAlmacenaje;
    }

    public String getCompensacionAlmacenaje() {
        return compensacionAlmacenaje;
    }

    public void setCompensacionAlmacenaje(String compensacionAlmacenaje) {
        this.compensacionAlmacenaje = compensacionAlmacenaje;
    }

    public String getMciaAsignadoAduana() {
        return mciaAsignadoAduana;
    }

    public void setMciaAsignadoAduana(String mciaAsignadoAduana) {
        this.mciaAsignadoAduana = mciaAsignadoAduana;
    }

    public String getOficioAduana() {
        return oficioAduana;
    }

    public void setOficioAduana(String oficioAduana) {
        this.oficioAduana = oficioAduana;
    }

    public String getOficioAduanaFisco() {
        return oficioAduanaFisco;
    }

    public void setOficioAduanaFisco(String oficioAduanaFisco) {
        this.oficioAduanaFisco = oficioAduanaFisco;
    }

    public String getAlmacenajeASolicitud() {
        return almacenajeASolicitud;
    }

    public void setAlmacenajeASolicitud(String almacenajeASolicitud) {
        this.almacenajeASolicitud = almacenajeASolicitud;
    }

    public String getVolumenMercancia() {
        return volumenMercancia;
    }

    public void setVolumenMercancia(String volumenMercancia) {
        this.volumenMercancia = volumenMercancia;
    }

    public Integer getIdCatPuertoAduana() {
        return idCatPuertoAduana;
    }

    public void setIdCatPuertoAduana(Integer idCatPuertoAduana) {
        this.idCatPuertoAduana = idCatPuertoAduana;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameHR() {
        return userNameHR;
    }

    public void setUserNameHR(String userNameHR) {
        this.userNameHR = userNameHR;
    }

    public Date getFechaHR() {
        return fechaHR;
    }

    public void setFechaHR(Date fechaHR) {
        this.fechaHR = fechaHR;
    }

    public Boolean getHr() {
        return hr;
    }

    public void setHr(Boolean hr) {
        this.hr = hr;
    }

    public String getUserNameCT() {
        return userNameCT;
    }

    public void setUserNameCT(String userNameCT) {
        this.userNameCT = userNameCT;
    }

    public Date getFechaCT() {
        return fechaCT;
    }

    public void setFechaCT(Date fechaCT) {
        this.fechaCT = fechaCT;
    }

    public ImexContainer getContainerId() {
        return containerId;
    }

    public void setContainerId(ImexContainer containerId) {
        this.containerId = containerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoEntregaId != null ? infoEntregaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ImexInfoEntregaAduana)) {
            return false;
        }
        ImexInfoEntregaAduana other = (ImexInfoEntregaAduana) object;
        if ((this.infoEntregaId == null && other.infoEntregaId != null) || (this.infoEntregaId != null && !this.infoEntregaId.equals(other.infoEntregaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tmm.myr.base.entities.ImexInfoEntregaAduana[ infoEntregaId=" + infoEntregaId + " ]";
    }
    
}
