package best.hyun.pgrc.type.gigaros

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gigaros : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gigaros)
    override val type: PET_TYPE
        get() = PET_TYPE.GIGAROS
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gigaros)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WIND
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 70
    override val subElementalValue: Int
        get() = 30
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 65
    override val initLvMaxAtk: Int
        get() = 12
    override val initLvMaxDef: Int
        get() = 12
    override val initLvMaxSpd: Int
        get() = 6
    override val maxLvMaxHp: Int
        get() = 1547
    override val maxLvMaxAtk: Int
        get() = 306
    override val maxLvMaxDef: Int
        get() = 293
    override val maxLvMaxSpd: Int
        get() = 155
    override val initLvMinHp: Int
        get() = 51
    override val initLvMinAtk: Int
        get() = 10
    override val initLvMinDef: Int
        get() = 9
    override val initLvMinSpd: Int
        get() = 4
    override val maxLvMinHp: Int
        get() = 1336
    override val maxLvMinAtk: Int
        get() = 267
    override val maxLvMinDef: Int
        get() = 255
    override val maxLvMinSpd: Int
        get() = 124
    override val minAllGrowth: Double
        get() = 4.508
    override val maxAllGrowth: Double
        get() = 5.215
}