package best.hyun.pgrc.type.zyag

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Gobankes : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_gobankes)
    override val type: PET_TYPE
        get() = PET_TYPE.ZYAG
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_gobankes)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.WATER
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.EARTH
    override val mainElementalValue: Int
        get() = 60
    override val subElementalValue: Int
        get() = 40
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 40
    override val initLvMaxAtk: Int
        get() = 9
    override val initLvMaxDef: Int
        get() = 6
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1463
    override val maxLvMaxAtk: Int
        get() = 328
    override val maxLvMaxDef: Int
        get() = 224
    override val maxLvMaxSpd: Int
        get() = 153
    override val initLvMinHp: Int
        get() = 31
    override val initLvMinAtk: Int
        get() = 7
    override val initLvMinDef: Int
        get() = 4
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 1255
    override val maxLvMinAtk: Int
        get() = 290
    override val maxLvMinDef: Int
        get() = 186
    override val maxLvMinSpd: Int
        get() = 122
    override val minAllGrowth: Double
        get() = 4.237
    override val maxAllGrowth: Double
        get() = 4.944
}