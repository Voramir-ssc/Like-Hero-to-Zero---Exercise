package de.likeherotozero.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`emmissionen`")
public class Co2Daten {
    @Id
    @Column(name = "`Jahr`")
    private Integer jahr;
    
    @Column(name = "`WORLD`")
    private BigDecimal world;

    @Column(name = "`CHN`")
    private BigDecimal chn;

    @Column(name = "`USA`")
    private BigDecimal usa;

    @Column(name = "`IND`")
    private BigDecimal ind;

    @Column(name = "`EUU`")
    private BigDecimal euu;

    @Column(name = "`RUS`")
    private BigDecimal rus;

    @Column(name = "`IDN`")
    private BigDecimal idn;

    @Column(name = "`JPN`")
    private BigDecimal jpn;

    @Column(name = "`BRA`")
    private BigDecimal bra;

    @Column(name = "`IRN`")
    private BigDecimal irn;

    @Column(name = "`DEU`")
    private BigDecimal deu;

    @Column(name = "`COD`")
    private BigDecimal cod;

    @Column(name = "`CAN`")
    private BigDecimal can;

    @Column(name = "`SAU`")
    private BigDecimal sau;

    @Column(name = "`KOR`")
    private BigDecimal kor;

    @Column(name = "`MEX`")
    private BigDecimal mex;

    @Column(name = "`ZAF`")
    private BigDecimal zaf;

    @Column(name = "`TUR`")
    private BigDecimal tur;

    @Column(name = "`AUS`")
    private BigDecimal aus;

    @Column(name = "`VNM`")
    private BigDecimal vnm;

    @Column(name = "`GBR`")
    private BigDecimal gbr;

    @Column(name = "`MYS`")
    private BigDecimal mys;

    @Column(name = "`ITA`")
    private BigDecimal ita;

    @Column(name = "`THA`")
    private BigDecimal tha;

    @Column(name = "`POL`")
    private BigDecimal pol;

    @Column(name = "`EGY`")
    private BigDecimal egy;

    @Column(name = "`KAZ`")
    private BigDecimal kaz;

    @Column(name = "`FRA`")
    private BigDecimal fra;

    @Column(name = "`PAK`")
    private BigDecimal pak;

    @Column(name = "`IRQ`")
    private BigDecimal irq;

    @Column(name = "`ARG`")
    private BigDecimal arg;

    @Column(name = "`ESP`")
    private BigDecimal esp;

    @Column(name = "`ARE`")
    private BigDecimal are;

    @Column(name = "`DZA`")
    private BigDecimal dza;

    @Column(name = "`NGA`")
    private BigDecimal nga;

    @Column(name = "`COL`")
    private BigDecimal col;

    @Column(name = "`PER`")
    private BigDecimal per;

    @Column(name = "`PHL`")
    private BigDecimal phl;

    @Column(name = "`MMR`")
    private BigDecimal mmr;

    @Column(name = "`NLD`")
    private BigDecimal nld;

    @Column(name = "`VEN`")
    private BigDecimal ven;

    @Column(name = "`BGD`")
    private BigDecimal bgd;

    @Column(name = "`UZB`")
    private BigDecimal uzb;

    @Column(name = "`UKR`")
    private BigDecimal ukr;

    @Column(name = "`ZWE`")
    private BigDecimal zwe;

    @Column(name = "`TKM`")
    private BigDecimal tkm;

    @Column(name = "`KWT`")
    private BigDecimal kwt;

    @Column(name = "`QAT`")
    private BigDecimal qat;

    @Column(name = "`BOL`")
    private BigDecimal bol;

    @Column(name = "`CZE`")
    private BigDecimal cze;

    @Column(name = "`TZA`")
    private BigDecimal tza;

    @Column(name = "`OMN`")
    private BigDecimal omn;

    @Column(name = "`BEL`")
    private BigDecimal bel;

    @Column(name = "`MAR`")
    private BigDecimal mar;

    @Column(name = "`ECU`")
    private BigDecimal ecu;

    @Column(name = "`MOZ`")
    private BigDecimal moz;

    @Column(name = "`PRK`")
    private BigDecimal prk;

    @Column(name = "`ISR`")
    private BigDecimal isr;

    @Column(name = "`AGO`")
    private BigDecimal ago;

    @Column(name = "`LBY`")
    private BigDecimal lby;

    @Column(name = "`GRC`")
    private BigDecimal grc;

    @Column(name = "`PRY`")
    private BigDecimal pry;

    @Column(name = "`AUT`")
    private BigDecimal aut;

    @Column(name = "`BLR`")
    private BigDecimal blr;

    @Column(name = "`KHM`")
    private BigDecimal khm;

    @Column(name = "`FIN`")
    private BigDecimal fin;

    @Column(name = "`ETH`")
    private BigDecimal eth;

    @Column(name = "`BWA`")
    private BigDecimal bwa;

    @Column(name = "`ROU`")
    private BigDecimal rou;

    @Column(name = "`SGP`")
    private BigDecimal sgp;

    @Column(name = "`MNG`")
    private BigDecimal mng;

    @Column(name = "`SRB`")
    private BigDecimal srb;

    @Column(name = "`SLB`")
    private BigDecimal slb;

    @Column(name = "`HUN`")
    private BigDecimal hun;

    @Column(name = "`ZMB`")
    private BigDecimal zmb;

    @Column(name = "`CMR`")
    private BigDecimal cmr;

    @Column(name = "`CIV`")
    private BigDecimal civ;

    @Column(name = "`IRL`")
    private BigDecimal irl;

    @Column(name = "`PNG`")
    private BigDecimal png;

    @Column(name = "`SDN`")
    private BigDecimal sdn;

    @Column(name = "`PRT`")
    private BigDecimal prt;

    @Column(name = "`AZE`")
    private BigDecimal aze;

    @Column(name = "`BHR`")
    private BigDecimal bhr;

    @Column(name = "`LAO`")
    private BigDecimal lao;

    @Column(name = "`CHE`")
    private BigDecimal che;

    @Column(name = "`SYR`")
    private BigDecimal syr;

    @Column(name = "`BFA`")
    private BigDecimal bfa;

    @Column(name = "`CHL`")
    private BigDecimal chl;

    @Column(name = "`DNK`")
    private BigDecimal dnk;

    @Column(name = "`DOM`")
    private BigDecimal dom;

    @Column(name = "`SVK`")
    private BigDecimal svk;

    @Column(name = "`TUN`")
    private BigDecimal tun;

    @Column(name = "`TCD`")
    private BigDecimal tcd;

    @Column(name = "`NIC`")
    private BigDecimal nic;

    @Column(name = "`JOR`")
    private BigDecimal jor;

    @Column(name = "`SWE`")
    private BigDecimal swe;

    @Column(name = "`LKA`")
    private BigDecimal lka;

    @Column(name = "`NOR`")
    private BigDecimal nor;

    @Column(name = "`GTM`")
    private BigDecimal gtm;

    @Column(name = "`UGA`")
    private BigDecimal uga;

    @Column(name = "`NZL`")
    private BigDecimal nzl;

    @Column(name = "`BIH`")
    private BigDecimal bih;

    @Column(name = "`SEN`")
    private BigDecimal sen;

    @Column(name = "`COG`")
    private BigDecimal cog;

    @Column(name = "`SOM`")
    private BigDecimal som;

    @Column(name = "`NPL`")
    private BigDecimal npl;

    @Column(name = "`BEN`")
    private BigDecimal ben;

    @Column(name = "`CUB`")
    private BigDecimal cub;

    @Column(name = "`GUY`")
    private BigDecimal guy;

    @Column(name = "`GIN`")
    private BigDecimal gin;

    @Column(name = "`HND`")
    private BigDecimal hnd;

    @Column(name = "`LTU`")
    private BigDecimal ltu;

    @Column(name = "`PAN`")
    private BigDecimal pan;

    @Column(name = "`EST`")
    private BigDecimal est;

    @Column(name = "`TTO`")
    private BigDecimal tto;

    @Column(name = "`CAF`")
    private BigDecimal caf;

    @Column(name = "`NAM`")
    private BigDecimal nam;

    @Column(name = "`LBR`")
    private BigDecimal lbr;

    @Column(name = "`KEN`")
    private BigDecimal ken;

    @Column(name = "`MDG`")
    private BigDecimal mdg;

    @Column(name = "`SSD`")
    private BigDecimal ssd;

    @Column(name = "`SVN`")
    private BigDecimal svn;

    @Column(name = "`HRV`")
    private BigDecimal hrv;

    @Column(name = "`SUR`")
    private BigDecimal sur;

    @Column(name = "`GEO`")
    private BigDecimal geo;

    @Column(name = "`GAB`")
    private BigDecimal gab;

    @Column(name = "`YEM`")
    private BigDecimal yem;

    @Column(name = "`LBN`")
    private BigDecimal lbn;

    @Column(name = "`AFG`")
    private BigDecimal afg;

    @Column(name = "`BGR`")
    private BigDecimal bgr;

    @Column(name = "`MWI`")
    private BigDecimal mwi;

    @Column(name = "`TJK`")
    private BigDecimal tjk;

    @Column(name = "`BRN`")
    private BigDecimal brn;

    @Column(name = "`SLV`")
    private BigDecimal slv;

    @Column(name = "`MDA`")
    private BigDecimal mda;

    @Column(name = "`ARM`")
    private BigDecimal arm;

    @Column(name = "`MKD`")
    private BigDecimal mkd;

    @Column(name = "`MLI`")
    private BigDecimal mli;

    @Column(name = "`JAM`")
    private BigDecimal jam;

    @Column(name = "`GNQ`")
    private BigDecimal gnq;

    @Column(name = "`KGZ`")
    private BigDecimal kgz;

    @Column(name = "`LUX`")
    private BigDecimal lux;

    @Column(name = "`CYP`")
    private BigDecimal cyp;

    @Column(name = "`LVA`")
    private BigDecimal lva;

    @Column(name = "`BLZ`")
    private BigDecimal blz;

    @Column(name = "`URY`")
    private BigDecimal ury;

    @Column(name = "`SLE`")
    private BigDecimal sle;

    @Column(name = "`ALB`")
    private BigDecimal alb;

    @Column(name = "`NER`")
    private BigDecimal ner;

    @Column(name = "`MUS`")
    private BigDecimal mus;

    @Column(name = "`BDI`")
    private BigDecimal bdi;

    @Column(name = "`HTI`")
    private BigDecimal hti;

    @Column(name = "`TGO`")
    private BigDecimal tgo;

    @Column(name = "`MRT`")
    private BigDecimal mrt;

    @Column(name = "`RWA`")
    private BigDecimal rwa;

    @Column(name = "`BHS`")
    private BigDecimal bhs;

    @Column(name = "`MNE`")
    private BigDecimal mne;

    @Column(name = "`LSO`")
    private BigDecimal lso;

    @Column(name = "`ISL`")
    private BigDecimal isl;

    @Column(name = "`MDV`")
    private BigDecimal mdv;

    @Column(name = "`GNB`")
    private BigDecimal gnb;

    @Column(name = "`MLT`")
    private BigDecimal mlt;

    @Column(name = "`GMB`")
    private BigDecimal gmb;

    @Column(name = "`BRB`")
    private BigDecimal brb;

    @Column(name = "`ERI`")
    private BigDecimal eri;

    @Column(name = "`TLS`")
    private BigDecimal tls;

    @Column(name = "`SWZ`")
    private BigDecimal swz;

    @Column(name = "`ATG`")
    private BigDecimal atg;

    @Column(name = "`SYC`")
    private BigDecimal syc;

    @Column(name = "`CRI`")
    private BigDecimal cri;

    @Column(name = "`DJI`")
    private BigDecimal dji;

    @Column(name = "`COM`")
    private BigDecimal com;

    @Column(name = "`CPV`")
    private BigDecimal cpv;

    @Column(name = "`AND`")
    private BigDecimal and;

    @Column(name = "`LCA`")
    private BigDecimal lca;

    @Column(name = "`STP`")
    private BigDecimal stp;

    @Column(name = "`GRD`")
    private BigDecimal grd;

    @Column(name = "`WSM`")
    private BigDecimal wsm;

    @Column(name = "`VCT`")
    private BigDecimal vct;

    @Column(name = "`KNA`")
    private BigDecimal kna;

    @Column(name = "`VUT`")
    private BigDecimal vut;

    @Column(name = "`PLW`")
    private BigDecimal plw;

    @Column(name = "`TON`")
    private BigDecimal ton;

    @Column(name = "`DMA`")
    private BigDecimal dma;

    @Column(name = "`LIE`")
    private BigDecimal lie;

    @Column(name = "`BTN`")
    private BigDecimal btn;

    @Column(name = "`MHL`")
    private BigDecimal mhl;

    @Column(name = "`FSM`")
    private BigDecimal fsm;

    @Column(name = "`COK`")
    private BigDecimal cok;

    @Column(name = "`KIR`")
    private BigDecimal kir;

    @Column(name = "`NRU`")
    private BigDecimal nru;

    @Column(name = "`TUV`")
    private BigDecimal tuv;

    @Column(name = "`NIU`")
    private BigDecimal niu;

    @Column(name = "`FJI`")
    private BigDecimal fji;

    @Column(name = "`GHA`")
    private BigDecimal gha;

    // Getter und Setter
    public Integer getJahr() {
        return jahr;
    }

    public void setJahr(Integer jahr) {
        this.jahr = jahr;
    }

    public BigDecimal getWorld() {
        return world;
    }

    public void setWorld(BigDecimal world) {
        this.world = world;
    }

    public BigDecimal getChn() {
        return chn;
    }

    public void setChn(BigDecimal chn) {
        this.chn = chn;
    }

    public BigDecimal getUsa() {
        return usa;
    }

    public void setUsa(BigDecimal usa) {
        this.usa = usa;
    }

    public BigDecimal getInd() {
        return ind;
    }

    public void setInd(BigDecimal ind) {
        this.ind = ind;
    }

    public BigDecimal getEuu() {
        return euu;
    }

    public void setEuu(BigDecimal euu) {
        this.euu = euu;
    }

    public BigDecimal getRus() {
        return rus;
    }

    public void setRus(BigDecimal rus) {
        this.rus = rus;
    }

    public BigDecimal getIdn() {
        return idn;
    }

    public void setIdn(BigDecimal idn) {
        this.idn = idn;
    }

    public BigDecimal getJpn() {
        return jpn;
    }

    public void setJpn(BigDecimal jpn) {
        this.jpn = jpn;
    }

    public BigDecimal getBra() {
        return bra;
    }

    public void setBra(BigDecimal bra) {
        this.bra = bra;
    }

    public BigDecimal getIrn() {
        return irn;
    }

    public void setIrn(BigDecimal irn) {
        this.irn = irn;
    }

    public BigDecimal getDeu() {
        return deu;
    }

    public void setDeu(BigDecimal deu) {
        this.deu = deu;
    }

    public BigDecimal getCod() {
        return cod;
    }

    public void setCod(BigDecimal cod) {
        this.cod = cod;
    }

    public BigDecimal getCan() {
        return can;
    }

    public void setCan(BigDecimal can) {
        this.can = can;
    }

    public BigDecimal getSau() {
        return sau;
    }

    public void setSau(BigDecimal sau) {
        this.sau = sau;
    }

    public BigDecimal getKor() {
        return kor;
    }

    public void setKor(BigDecimal kor) {
        this.kor = kor;
    }

    public BigDecimal getMex() {
        return mex;
    }

    public void setMex(BigDecimal mex) {
        this.mex = mex;
    }

    public BigDecimal getZaf() {
        return zaf;
    }

    public void setZaf(BigDecimal zaf) {
        this.zaf = zaf;
    }

    public BigDecimal getTur() {
        return tur;
    }

    public void setTur(BigDecimal tur) {
        this.tur = tur;
    }

    public BigDecimal getAus() {
        return aus;
    }

    public void setAus(BigDecimal aus) {
        this.aus = aus;
    }

    public BigDecimal getVnm() {
        return vnm;
    }

    public void setVnm(BigDecimal vnm) {
        this.vnm = vnm;
    }

    public BigDecimal getGbr() {
        return gbr;
    }

    public void setGbr(BigDecimal gbr) {
        this.gbr = gbr;
    }

    public BigDecimal getMys() {
        return mys;
    }

    public void setMys(BigDecimal mys) {
        this.mys = mys;
    }

    public BigDecimal getIta() {
        return ita;
    }

    public void setIta(BigDecimal ita) {
        this.ita = ita;
    }

    public BigDecimal getTha() {
        return tha;
    }

    public void setTha(BigDecimal tha) {
        this.tha = tha;
    }

    public BigDecimal getPol() {
        return pol;
    }

    public void setPol(BigDecimal pol) {
        this.pol = pol;
    }

    public BigDecimal getEgy() {
        return egy;
    }

    public void setEgy(BigDecimal egy) {
        this.egy = egy;
    }

    public BigDecimal getKaz() {
        return kaz;
    }

    public void setKaz(BigDecimal kaz) {
        this.kaz = kaz;
    }

    public BigDecimal getFra() {
        return fra;
    }

    public void setFra(BigDecimal fra) {
        this.fra = fra;
    }

    public BigDecimal getPak() {
        return pak;
    }

    public void setPak(BigDecimal pak) {
        this.pak = pak;
    }

    public BigDecimal getIrq() {
        return irq;
    }

    public void setIrq(BigDecimal irq) {
        this.irq = irq;
    }

    public BigDecimal getArg() {
        return arg;
    }

    public void setArg(BigDecimal arg) {
        this.arg = arg;
    }

    public BigDecimal getEsp() {
        return esp;
    }

    public void setEsp(BigDecimal esp) {
        this.esp = esp;
    }

    public BigDecimal getAre() {
        return are;
    }

    public void setAre(BigDecimal are) {
        this.are = are;
    }

    public BigDecimal getDza() {
        return dza;
    }

    public void setDza(BigDecimal dza) {
        this.dza = dza;
    }

    public BigDecimal getNga() {
        return nga;
    }

    public void setNga(BigDecimal nga) {
        this.nga = nga;
    }

    public BigDecimal getCol() {
        return col;
    }

    public void setCol(BigDecimal col) {
        this.col = col;
    }

    public BigDecimal getPer() {
        return per;
    }

    public void setPer(BigDecimal per) {
        this.per = per;
    }

    public BigDecimal getPhl() {
        return phl;
    }

    public void setPhl(BigDecimal phl) {
        this.phl = phl;
    }

    public BigDecimal getMmr() {
        return mmr;
    }

    public void setMmr(BigDecimal mmr) {
        this.mmr = mmr;
    }

    public BigDecimal getNld() {
        return nld;
    }

    public void setNld(BigDecimal nld) {
        this.nld = nld;
    }

    public BigDecimal getVen() {
        return ven;
    }

    public void setVen(BigDecimal ven) {
        this.ven = ven;
    }

    public BigDecimal getBgd() {
        return bgd;
    }

    public void setBgd(BigDecimal bgd) {
        this.bgd = bgd;
    }

    public BigDecimal getUzb() {
        return uzb;
    }

    public void setUzb(BigDecimal uzb) {
        this.uzb = uzb;
    }

    public BigDecimal getUkr() {
        return ukr;
    }

    public void setUkr(BigDecimal ukr) {
        this.ukr = ukr;
    }

    public BigDecimal getZwe() {
        return zwe;
    }

    public void setZwe(BigDecimal zwe) {
        this.zwe = zwe;
    }

    public BigDecimal getTkm() {
        return tkm;
    }

    public void setTkm(BigDecimal tkm) {
        this.tkm = tkm;
    }

    public BigDecimal getKwt() {
        return kwt;
    }

    public void setKwt(BigDecimal kwt) {
        this.kwt = kwt;
    }

    public BigDecimal getQat() {
        return qat;
    }

    public void setQat(BigDecimal qat) {
        this.qat = qat;
    }

    public BigDecimal getBol() {
        return bol;
    }

    public void setBol(BigDecimal bol) {
        this.bol = bol;
    }

    public BigDecimal getCze() {
        return cze;
    }

    public void setCze(BigDecimal cze) {
        this.cze = cze;
    }

    public BigDecimal getTza() {
        return tza;
    }

    public void setTza(BigDecimal tza) {
        this.tza = tza;
    }

    public BigDecimal getOmn() {
        return omn;
    }

    public void setOmn(BigDecimal omn) {
        this.omn = omn;
    }

    public BigDecimal getBel() {
        return bel;
    }

    public void setBel(BigDecimal bel) {
        this.bel = bel;
    }

    public BigDecimal getMar() {
        return mar;
    }

    public void setMar(BigDecimal mar) {
        this.mar = mar;
    }

    public BigDecimal getEcu() {
        return ecu;
    }

    public void setEcu(BigDecimal ecu) {
        this.ecu = ecu;
    }

    public BigDecimal getMoz() {
        return moz;
    }

    public void setMoz(BigDecimal moz) {
        this.moz = moz;
    }

    public BigDecimal getPrk() {
        return prk;
    }

    public void setPrk(BigDecimal prk) {
        this.prk = prk;
    }

    public BigDecimal getIsr() {
        return isr;
    }

    public void setIsr(BigDecimal isr) {
        this.isr = isr;
    }

    public BigDecimal getAgo() {
        return ago;
    }

    public void setAgo(BigDecimal ago) {
        this.ago = ago;
    }

    public BigDecimal getLby() {
        return lby;
    }

    public void setLby(BigDecimal lby) {
        this.lby = lby;
    }

    public BigDecimal getGrc() {
        return grc;
    }

    public void setGrc(BigDecimal grc) {
        this.grc = grc;
    }

    public BigDecimal getPry() {
        return pry;
    }

    public void setPry(BigDecimal pry) {
        this.pry = pry;
    }

    public BigDecimal getAut() {
        return aut;
    }

    public void setAut(BigDecimal aut) {
        this.aut = aut;
    }

    public BigDecimal getBlr() {
        return blr;
    }

    public void setBlr(BigDecimal blr) {
        this.blr = blr;
    }

    public BigDecimal getKhm() {
        return khm;
    }

    public void setKhm(BigDecimal khm) {
        this.khm = khm;
    }

    public BigDecimal getFin() {
        return fin;
    }

    public void setFin(BigDecimal fin) {
        this.fin = fin;
    }

    public BigDecimal getEth() {
        return eth;
    }

    public void setEth(BigDecimal eth) {
        this.eth = eth;
    }

    public BigDecimal getBwa() {
        return bwa;
    }

    public void setBwa(BigDecimal bwa) {
        this.bwa = bwa;
    }

    public BigDecimal getRou() {
        return rou;
    }

    public void setRou(BigDecimal rou) {
        this.rou = rou;
    }

    public BigDecimal getSgp() {
        return sgp;
    }

    public void setSgp(BigDecimal sgp) {
        this.sgp = sgp;
    }

    public BigDecimal getMng() {
        return mng;
    }

    public void setMng(BigDecimal mng) {
        this.mng = mng;
    }

    public BigDecimal getSrb() {
        return srb;
    }

    public void setSrb(BigDecimal srb) {
        this.srb = srb;
    }

    public BigDecimal getSlb() {
        return slb;
    }

    public void setSlb(BigDecimal slb) {
        this.slb = slb;
    }

    public BigDecimal getHun() {
        return hun;
    }

    public void setHun(BigDecimal hun) {
        this.hun = hun;
    }

    public BigDecimal getZmb() {
        return zmb;
    }

    public void setZmb(BigDecimal zmb) {
        this.zmb = zmb;
    }

    public BigDecimal getCmr() {
        return cmr;
    }

    public void setCmr(BigDecimal cmr) {
        this.cmr = cmr;
    }

    public BigDecimal getCiv() {
        return civ;
    }

    public void setCiv(BigDecimal civ) {
        this.civ = civ;
    }

    public BigDecimal getIrl() {
        return irl;
    }

    public void setIrl(BigDecimal irl) {
        this.irl = irl;
    }

    public BigDecimal getPng() {
        return png;
    }

    public void setPng(BigDecimal png) {
        this.png = png;
    }

    public BigDecimal getSdn() {
        return sdn;
    }

    public void setSdn(BigDecimal sdn) {
        this.sdn = sdn;
    }

    public BigDecimal getPrt() {
        return prt;
    }

    public void setPrt(BigDecimal prt) {
        this.prt = prt;
    }

    public BigDecimal getAze() {
        return aze;
    }

    public void setAze(BigDecimal aze) {
        this.aze = aze;
    }

    public BigDecimal getBhr() {
        return bhr;
    }

    public void setBhr(BigDecimal bhr) {
        this.bhr = bhr;
    }

    public BigDecimal getLao() {
        return lao;
    }

    public void setLao(BigDecimal lao) {
        this.lao = lao;
    }

    public BigDecimal getChe() {
        return che;
    }

    public void setChe(BigDecimal che) {
        this.che = che;
    }

    public BigDecimal getSyr() {
        return syr;
    }

    public void setSyr(BigDecimal syr) {
        this.syr = syr;
    }

    public BigDecimal getBfa() {
        return bfa;
    }

    public void setBfa(BigDecimal bfa) {
        this.bfa = bfa;
    }

    public BigDecimal getChl() {
        return chl;
    }

    public void setChl(BigDecimal chl) {
        this.chl = chl;
    }

    public BigDecimal getDnk() {
        return dnk;
    }

    public void setDnk(BigDecimal dnk) {
        this.dnk = dnk;
    }

    public BigDecimal getDom() {
        return dom;
    }

    public void setDom(BigDecimal dom) {
        this.dom = dom;
    }

    public BigDecimal getSvk() {
        return svk;
    }

    public void setSvk(BigDecimal svk) {
        this.svk = svk;
    }

    public BigDecimal getTun() {
        return tun;
    }

    public void setTun(BigDecimal tun) {
        this.tun = tun;
    }

    public BigDecimal getTcd() {
        return tcd;
    }

    public void setTcd(BigDecimal tcd) {
        this.tcd = tcd;
    }

    public BigDecimal getNic() {
        return nic;
    }

    public void setNic(BigDecimal nic) {
        this.nic = nic;
    }

    public BigDecimal getJor() {
        return jor;
    }

    public void setJor(BigDecimal jor) {
        this.jor = jor;
    }

    public BigDecimal getSwe() {
        return swe;
    }

    public void setSwe(BigDecimal swe) {
        this.swe = swe;
    }

    public BigDecimal getLka() {
        return lka;
    }

    public void setLka(BigDecimal lka) {
        this.lka = lka;
    }

    public BigDecimal getNor() {
        return nor;
    }

    public void setNor(BigDecimal nor) {
        this.nor = nor;
    }

    public BigDecimal getGtm() {
        return gtm;
    }

    public void setGtm(BigDecimal gtm) {
        this.gtm = gtm;
    }

    public BigDecimal getUga() {
        return uga;
    }

    public void setUga(BigDecimal uga) {
        this.uga = uga;
    }

    public BigDecimal getNzl() {
        return nzl;
    }

    public void setNzl(BigDecimal nzl) {
        this.nzl = nzl;
    }

    public BigDecimal getBih() {
        return bih;
    }

    public void setBih(BigDecimal bih) {
        this.bih = bih;
    }

    public BigDecimal getSen() {
        return sen;
    }

    public void setSen(BigDecimal sen) {
        this.sen = sen;
    }

    public BigDecimal getCog() {
        return cog;
    }

    public void setCog(BigDecimal cog) {
        this.cog = cog;
    }

    public BigDecimal getSom() {
        return som;
    }

    public void setSom(BigDecimal som) {
        this.som = som;
    }

    public BigDecimal getNpl() {
        return npl;
    }

    public void setNpl(BigDecimal npl) {
        this.npl = npl;
    }

    public BigDecimal getBen() {
        return ben;
    }

    public void setBen(BigDecimal ben) {
        this.ben = ben;
    }

    public BigDecimal getCub() {
        return cub;
    }

    public void setCub(BigDecimal cub) {
        this.cub = cub;
    }

    public BigDecimal getGuy() {
        return guy;
    }

    public void setGuy(BigDecimal guy) {
        this.guy = guy;
    }

    public BigDecimal getGin() {
        return gin;
    }

    public void setGin(BigDecimal gin) {
        this.gin = gin;
    }

    public BigDecimal getHnd() {
        return hnd;
    }

    public void setHnd(BigDecimal hnd) {
        this.hnd = hnd;
    }

    public BigDecimal getLtu() {
        return ltu;
    }

    public void setLtu(BigDecimal ltu) {
        this.ltu = ltu;
    }

    public BigDecimal getPan() {
        return pan;
    }

    public void setPan(BigDecimal pan) {
        this.pan = pan;
    }

    public BigDecimal getEst() {
        return est;
    }

    public void setEst(BigDecimal est) {
        this.est = est;
    }

    public BigDecimal getTto() {
        return tto;
    }

    public void setTto(BigDecimal tto) {
        this.tto = tto;
    }

    public BigDecimal getCaf() {
        return caf;
    }

    public void setCaf(BigDecimal caf) {
        this.caf = caf;
    }

    public BigDecimal getNam() {
        return nam;
    }

    public void setNam(BigDecimal nam) {
        this.nam = nam;
    }

    public BigDecimal getLbr() {
        return lbr;
    }

    public void setLbr(BigDecimal lbr) {
        this.lbr = lbr;
    }

    public BigDecimal getKen() {
        return ken;
    }

    public void setKen(BigDecimal ken) {
        this.ken = ken;
    }

    public BigDecimal getMdg() {
        return mdg;
    }

    public void setMdg(BigDecimal mdg) {
        this.mdg = mdg;
    }

    public BigDecimal getSsd() {
        return ssd;
    }

    public void setSsd(BigDecimal ssd) {
        this.ssd = ssd;
    }

    public BigDecimal getSvn() {
        return svn;
    }

    public void setSvn(BigDecimal svn) {
        this.svn = svn;
    }

    public BigDecimal getHrv() {
        return hrv;
    }

    public void setHrv(BigDecimal hrv) {
        this.hrv = hrv;
    }

    public BigDecimal getSur() {
        return sur;
    }

    public void setSur(BigDecimal sur) {
        this.sur = sur;
    }

    public BigDecimal getGeo() {
        return geo;
    }

    public void setGeo(BigDecimal geo) {
        this.geo = geo;
    }

    public BigDecimal getGab() {
        return gab;
    }

    public void setGab(BigDecimal gab) {
        this.gab = gab;
    }

    public BigDecimal getYem() {
        return yem;
    }

    public void setYem(BigDecimal yem) {
        this.yem = yem;
    }

    public BigDecimal getLbn() {
        return lbn;
    }

    public void setLbn(BigDecimal lbn) {
        this.lbn = lbn;
    }

    public BigDecimal getAfg() {
        return afg;
    }

    public void setAfg(BigDecimal afg) {
        this.afg = afg;
    }

    public BigDecimal getBgr() {
        return bgr;
    }

    public void setBgr(BigDecimal bgr) {
        this.bgr = bgr;
    }

    public BigDecimal getMwi() {
        return mwi;
    }

    public void setMwi(BigDecimal mwi) {
        this.mwi = mwi;
    }

    public BigDecimal getTjk() {
        return tjk;
    }

    public void setTjk(BigDecimal tjk) {
        this.tjk = tjk;
    }

    public BigDecimal getBrn() {
        return brn;
    }

    public void setBrn(BigDecimal brn) {
        this.brn = brn;
    }

    public BigDecimal getSlv() {
        return slv;
    }

    public void setSlv(BigDecimal slv) {
        this.slv = slv;
    }

    public BigDecimal getMda() {
        return mda;
    }

    public void setMda(BigDecimal mda) {
        this.mda = mda;
    }

    public BigDecimal getArm() {
        return arm;
    }

    public void setArm(BigDecimal arm) {
        this.arm = arm;
    }

    public BigDecimal getMkd() {
        return mkd;
    }

    public void setMkd(BigDecimal mkd) {
        this.mkd = mkd;
    }

    public BigDecimal getMli() {
        return mli;
    }

    public void setMli(BigDecimal mli) {
        this.mli = mli;
    }

    public BigDecimal getJam() {
        return jam;
    }

    public void setJam(BigDecimal jam) {
        this.jam = jam;
    }

    public BigDecimal getGnq() {
        return gnq;
    }

    public void setGnq(BigDecimal gnq) {
        this.gnq = gnq;
    }

    public BigDecimal getKgz() {
        return kgz;
    }

    public void setKgz(BigDecimal kgz) {
        this.kgz = kgz;
    }

    public BigDecimal getLux() {
        return lux;
    }

    public void setLux(BigDecimal lux) {
        this.lux = lux;
    }

    public BigDecimal getCyp() {
        return cyp;
    }

    public void setCyp(BigDecimal cyp) {
        this.cyp = cyp;
    }

    public BigDecimal getLva() {
        return lva;
    }

    public void setLva(BigDecimal lva) {
        this.lva = lva;
    }

    public BigDecimal getBlz() {
        return blz;
    }

    public void setBlz(BigDecimal blz) {
        this.blz = blz;
    }

    public BigDecimal getUry() {
        return ury;
    }

    public void setUry(BigDecimal ury) {
        this.ury = ury;
    }

    public BigDecimal getSle() {
        return sle;
    }

    public void setSle(BigDecimal sle) {
        this.sle = sle;
    }

    public BigDecimal getAlb() {
        return alb;
    }

    public void setAlb(BigDecimal alb) {
        this.alb = alb;
    }

    public BigDecimal getNer() {
        return ner;
    }

    public void setNer(BigDecimal ner) {
        this.ner = ner;
    }

    public BigDecimal getMus() {
        return mus;
    }

    public void setMus(BigDecimal mus) {
        this.mus = mus;
    }

    public BigDecimal getBdi() {
        return bdi;
    }

    public void setBdi(BigDecimal bdi) {
        this.bdi = bdi;
    }

    public BigDecimal getHti() {
        return hti;
    }

    public void setHti(BigDecimal hti) {
        this.hti = hti;
    }

    public BigDecimal getTgo() {
        return tgo;
    }

    public void setTgo(BigDecimal tgo) {
        this.tgo = tgo;
    }

    public BigDecimal getMrt() {
        return mrt;
    }

    public void setMrt(BigDecimal mrt) {
        this.mrt = mrt;
    }

    public BigDecimal getRwa() {
        return rwa;
    }

    public void setRwa(BigDecimal rwa) {
        this.rwa = rwa;
    }

    public BigDecimal getBhs() {
        return bhs;
    }

    public void setBhs(BigDecimal bhs) {
        this.bhs = bhs;
    }

    public BigDecimal getMne() {
        return mne;
    }

    public void setMne(BigDecimal mne) {
        this.mne = mne;
    }

    public BigDecimal getLso() {
        return lso;
    }

    public void setLso(BigDecimal lso) {
        this.lso = lso;
    }

    public BigDecimal getIsl() {
        return isl;
    }

    public void setIsl(BigDecimal isl) {
        this.isl = isl;
    }

    public BigDecimal getMdv() {
        return mdv;
    }

    public void setMdv(BigDecimal mdv) {
        this.mdv = mdv;
    }

    public BigDecimal getGnb() {
        return gnb;
    }

    public void setGnb(BigDecimal gnb) {
        this.gnb = gnb;
    }

    public BigDecimal getMlt() {
        return mlt;
    }

    public void setMlt(BigDecimal mlt) {
        this.mlt = mlt;
    }

    public BigDecimal getGmb() {
        return gmb;
    }

    public void setGmb(BigDecimal gmb) {
        this.gmb = gmb;
    }

    public BigDecimal getBrb() {
        return brb;
    }

    public void setBrb(BigDecimal brb) {
        this.brb = brb;
    }

    public BigDecimal getEri() {
        return eri;
    }

    public void setEri(BigDecimal eri) {
        this.eri = eri;
    }

    public BigDecimal getTls() {
        return tls;
    }

    public void setTls(BigDecimal tls) {
        this.tls = tls;
    }

    public BigDecimal getSwz() {
        return swz;
    }

    public void setSwz(BigDecimal swz) {
        this.swz = swz;
    }

    public BigDecimal getAtg() {
        return atg;
    }

    public void setAtg(BigDecimal atg) {
        this.atg = atg;
    }

    public BigDecimal getSyc() {
        return syc;
    }

    public void setSyc(BigDecimal syc) {
        this.syc = syc;
    }

    public BigDecimal getCri() {
        return cri;
    }

    public void setCri(BigDecimal cri) {
        this.cri = cri;
    }

    public BigDecimal getDji() {
        return dji;
    }

    public void setDji(BigDecimal dji) {
        this.dji = dji;
    }

    public BigDecimal getCom() {
        return com;
    }

    public void setCom(BigDecimal com) {
        this.com = com;
    }

    public BigDecimal getCpv() {
        return cpv;
    }

    public void setCpv(BigDecimal cpv) {
        this.cpv = cpv;
    }

    public BigDecimal getAnd() {
        return and;
    }

    public void setAnd(BigDecimal and) {
        this.and = and;
    }

    public BigDecimal getLca() {
        return lca;
    }

    public void setLca(BigDecimal lca) {
        this.lca = lca;
    }

    public BigDecimal getStp() {
        return stp;
    }

    public void setStp(BigDecimal stp) {
        this.stp = stp;
    }

    public BigDecimal getGrd() {
        return grd;
    }

    public void setGrd(BigDecimal grd) {
        this.grd = grd;
    }

    public BigDecimal getWsm() {
        return wsm;
    }

    public void setWsm(BigDecimal wsm) {
        this.wsm = wsm;
    }

    public BigDecimal getVct() {
        return vct;
    }

    public void setVct(BigDecimal vct) {
        this.vct = vct;
    }

    public BigDecimal getKna() {
        return kna;
    }

    public void setKna(BigDecimal kna) {
        this.kna = kna;
    }

    public BigDecimal getVut() {
        return vut;
    }

    public void setVut(BigDecimal vut) {
        this.vut = vut;
    }

    public BigDecimal getPlw() {
        return plw;
    }

    public void setPlw(BigDecimal plw) {
        this.plw = plw;
    }

    public BigDecimal getTon() {
        return ton;
    }

    public void setTon(BigDecimal ton) {
        this.ton = ton;
    }

    public BigDecimal getDma() {
        return dma;
    }

    public void setDma(BigDecimal dma) {
        this.dma = dma;
    }

    public BigDecimal getLie() {
        return lie;
    }

    public void setLie(BigDecimal lie) {
        this.lie = lie;
    }

    public BigDecimal getBtn() {
        return btn;
    }

    public void setBtn(BigDecimal btn) {
        this.btn = btn;
    }

    public BigDecimal getMhl() {
        return mhl;
    }

    public void setMhl(BigDecimal mhl) {
        this.mhl = mhl;
    }

    public BigDecimal getFsm() {
        return fsm;
    }

    public void setFsm(BigDecimal fsm) {
        this.fsm = fsm;
    }

    public BigDecimal getCok() {
        return cok;
    }

    public void setCok(BigDecimal cok) {
        this.cok = cok;
    }

    public BigDecimal getKir() {
        return kir;
    }

    public void setKir(BigDecimal kir) {
        this.kir = kir;
    }

    public BigDecimal getNru() {
        return nru;
    }

    public void setNru(BigDecimal nru) {
        this.nru = nru;
    }

    public BigDecimal getTuv() {
        return tuv;
    }

    public void setTuv(BigDecimal tuv) {
        this.tuv = tuv;
    }

    public BigDecimal getNiu() {
        return niu;
    }

    public void setNiu(BigDecimal niu) {
        this.niu = niu;
    }

    public BigDecimal getFji() {
        return fji;
    }

    public void setFji(BigDecimal fji) {
        this.fji = fji;
    }

    public BigDecimal getGha() {
        return gha;
    }

    public void setGha(BigDecimal gha) {
        this.gha = gha;
    }

}
